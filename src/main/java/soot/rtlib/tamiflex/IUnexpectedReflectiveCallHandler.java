package soot.rtlib.tamiflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public interface IUnexpectedReflectiveCallHandler {

  public void classNewInstance(Class<?> c);

  public void classForName(String typeName);

  public void constructorNewInstance(Constructor<?> c);

  public void methodInvoke(Object receiver, Method m);

  public void fieldSet(Object receiver, Field f);

  public void fieldGet(Object receiver, Field f);

}