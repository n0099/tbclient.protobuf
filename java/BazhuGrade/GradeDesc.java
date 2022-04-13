package BazhuGrade;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BazhuGrade.GradeRight;

public final class GradeDesc extends Message {
  public static final String DEFAULT_GRADE = "";
  
  public static final Integer DEFAULT_POINT = Integer.valueOf(0);
  
  public static final List<GradeRight> DEFAULT_RIGHTS = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String grade;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer point;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<GradeRight> rights;
  
  public GradeDesc(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.grade;
      if (str == null) {
        this.grade = "";
      } else {
        this.grade = str;
      } 
      Integer integer = paramBuilder.point;
      if (integer == null) {
        this.point = DEFAULT_POINT;
      } else {
        this.point = integer;
      } 
      list = paramBuilder.rights;
      if (list == null) {
        this.rights = DEFAULT_RIGHTS;
      } else {
        this.rights = Message.immutableCopyOf(list);
      } 
    } else {
      this.grade = ((Builder)list).grade;
      this.point = ((Builder)list).point;
      this.rights = Message.immutableCopyOf(((Builder)list).rights);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(361415529, "Ltbclient/BazhuGrade/GradeDesc;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(361415529, "Ltbclient/BazhuGrade/GradeDesc;");
          return;
        } 
      } 
    } 
  }
}
