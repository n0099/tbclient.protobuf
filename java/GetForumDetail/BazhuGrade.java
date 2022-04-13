package GetForumDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GradePoint;

public final class BazhuGrade extends Message {
  public static final String DEFAULT_ESTIMATION_LEFT_TEXT = "";
  
  public static final Integer DEFAULT_ESTIMATION_LEFT_TIME;
  
  public static final String DEFAULT_GRADE = "";
  
  public static final List<GradePoint> DEFAULT_GRADE_POINT = Collections.emptyList();
  
  public static final String DEFAULT_GRADE_TEXT = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String estimation_left_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer estimation_left_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String grade;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<GradePoint> grade_point;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String grade_text;
  
  static {
    DEFAULT_ESTIMATION_LEFT_TIME = Integer.valueOf(0);
  }
  
  public BazhuGrade(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.grade;
      if (str2 == null) {
        this.grade = "";
      } else {
        this.grade = str2;
      } 
      List list = paramBuilder.grade_point;
      if (list == null) {
        this.grade_point = DEFAULT_GRADE_POINT;
      } else {
        this.grade_point = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.estimation_left_text;
      if (str1 == null) {
        this.estimation_left_text = "";
      } else {
        this.estimation_left_text = str1;
      } 
      str1 = paramBuilder.grade_text;
      if (str1 == null) {
        this.grade_text = "";
      } else {
        this.grade_text = str1;
      } 
      integer = paramBuilder.estimation_left_time;
      if (integer == null) {
        this.estimation_left_time = DEFAULT_ESTIMATION_LEFT_TIME;
      } else {
        this.estimation_left_time = integer;
      } 
    } else {
      this.grade = ((Builder)integer).grade;
      this.grade_point = Message.immutableCopyOf(((Builder)integer).grade_point);
      this.estimation_left_text = ((Builder)integer).estimation_left_text;
      this.grade_text = ((Builder)integer).grade_text;
      this.estimation_left_time = ((Builder)integer).estimation_left_time;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-700692957, "Ltbclient/GetForumDetail/BazhuGrade;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-700692957, "Ltbclient/GetForumDetail/BazhuGrade;");
          return;
        } 
      } 
    } 
  }
}
