package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsPage.StarContriRecord;
import tbclient.FrsPage.StarTaskInfo;

public final class StarRank extends Message {
  public static final List<StarContriRecord> DEFAULT_CONTRI_RECORD_LIST;
  
  public static final String DEFAULT_RANK_NAME = "";
  
  public static final Integer DEFAULT_RANK_RANKING;
  
  public static final String DEFAULT_URL = "";
  
  public static final Integer DEFAULT_USER_CONTRI_SCORE;
  
  public static final String DEFAULT_USER_CURRENT_SCORE_NOTICE = "";
  
  public static final List<StarTaskInfo> DEFAULT_USER_TASK_INFO;
  
  public static final String DEFAULT_USER_TASK_NOTICE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<StarContriRecord> contri_record_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String rank_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer rank_ranking;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer user_contri_score;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String user_current_score_notice;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<StarTaskInfo> user_task_info;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String user_task_notice;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1508677606, "Ltbclient/FrsPage/StarRank;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1508677606, "Ltbclient/FrsPage/StarRank;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_RANK_RANKING = integer;
    DEFAULT_CONTRI_RECORD_LIST = Collections.emptyList();
    DEFAULT_USER_CONTRI_SCORE = integer;
    DEFAULT_USER_TASK_INFO = Collections.emptyList();
  }
  
  public StarRank(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.rank_name;
      if (str3 == null) {
        this.rank_name = "";
      } else {
        this.rank_name = str3;
      } 
      Integer integer2 = paramBuilder.rank_ranking;
      if (integer2 == null) {
        this.rank_ranking = DEFAULT_RANK_RANKING;
      } else {
        this.rank_ranking = integer2;
      } 
      List list2 = paramBuilder.contri_record_list;
      if (list2 == null) {
        this.contri_record_list = DEFAULT_CONTRI_RECORD_LIST;
      } else {
        this.contri_record_list = Message.immutableCopyOf(list2);
      } 
      Integer integer1 = paramBuilder.user_contri_score;
      if (integer1 == null) {
        this.user_contri_score = DEFAULT_USER_CONTRI_SCORE;
      } else {
        this.user_contri_score = integer1;
      } 
      String str2 = paramBuilder.user_task_notice;
      if (str2 == null) {
        this.user_task_notice = "";
      } else {
        this.user_task_notice = str2;
      } 
      List list1 = paramBuilder.user_task_info;
      if (list1 == null) {
        this.user_task_info = DEFAULT_USER_TASK_INFO;
      } else {
        this.user_task_info = Message.immutableCopyOf(list1);
      } 
      String str1 = paramBuilder.user_current_score_notice;
      if (str1 == null) {
        this.user_current_score_notice = "";
      } else {
        this.user_current_score_notice = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.rank_name = ((Builder)str).rank_name;
      this.rank_ranking = ((Builder)str).rank_ranking;
      this.contri_record_list = Message.immutableCopyOf(((Builder)str).contri_record_list);
      this.user_contri_score = ((Builder)str).user_contri_score;
      this.user_task_notice = ((Builder)str).user_task_notice;
      this.user_task_info = Message.immutableCopyOf(((Builder)str).user_task_info);
      this.user_current_score_notice = ((Builder)str).user_current_score_notice;
      this.url = ((Builder)str).url;
    } 
  }
}
