package com.example.meituanlogin

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val user = MutableLiveData(User())

    fun loadData(context: Context){
        val userInfo = DataStoreUtil.loadUser(context)
        //更新liveData的数据
        user.postValue(userInfo)
    }

    fun saveData(context: Context,aUser: User){
        DataStoreUtil.saveUser(context, aUser)
        //更新liveData的数据
        user.postValue(aUser)
    }

    fun updateState(context: Context, isLogin: Boolean){
        DataStoreUtil.updateLoginState(context, isLogin)
        //只更新isLogin一个属性 只触发监听这个属性的UI的刷新，其他属性的监听不受影响
        user.postValue(user.value!!.copy(isLogin = isLogin))
    }
}