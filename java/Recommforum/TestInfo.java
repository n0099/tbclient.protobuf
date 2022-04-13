package Recommforum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Recommforum.RecommForum;

public final class TestInfo extends Message {
  public static final Integer DEFAULT_ANSWERED;
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final String DEFAULT_IMAGE_URL = "";
  
  public static final String DEFAULT_RESULT_IMG = "";
  
  public static final Long DEFAULT_TEST_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer answered;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer create_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String image_url;
  
  @ProtoField(tag = 9)
  public final RecommForum recomm_forum;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String result_img;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long test_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_ANSWERED = integer;
  }
  
  public TestInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.test_id;
      if (long_ == null) {
        this.test_id = DEFAULT_TEST_ID;
      } else {
        this.test_id = long_;
      } 
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.image_url;
      if (str2 == null) {
        this.image_url = "";
      } else {
        this.image_url = str2;
      } 
      Integer integer = paramBuilder.create_time;
      if (integer == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer;
      } 
      integer = paramBuilder.answered;
      if (integer == null) {
        this.answered = DEFAULT_ANSWERED;
      } else {
        this.answered = integer;
      } 
      String str1 = paramBuilder.result_img;
      if (str1 == null) {
        this.result_img = "";
      } else {
        this.result_img = str1;
      } 
      this.recomm_forum = paramBuilder.recomm_forum;
    } else {
      this.test_id = paramBuilder.test_id;
      this.title = paramBuilder.title;
      this.image_url = paramBuilder.image_url;
      this.create_time = paramBuilder.create_time;
      this.answered = paramBuilder.answered;
      this.result_img = paramBuilder.result_img;
      this.recomm_forum = paramBuilder.recomm_forum;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1624932348, "Ltbclient/Recommforum/TestInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1624932348, "Ltbclient/Recommforum/TestInfo;");
          return;
        } 
      } 
    } 
  }
}
