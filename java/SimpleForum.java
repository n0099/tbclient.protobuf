import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.DeletedReasonInfo;
import tbclient.FrsTabInfo;
import tbclient.MultiForumPerm;
import tbclient.SimpleForum;

public final class SimpleForum extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_EXT = "";
  
  public static final String DEFAULT_FIRST_CLASS = "";
  
  public static final String DEFAULT_FORUM_TOUTU = "";
  
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_IS_BRAND_FORUM;
  
  public static final Integer DEFAULT_IS_EXISTS;
  
  public static final Integer DEFAULT_IS_FRS_MASK;
  
  public static final Integer DEFAULT_IS_LIKED;
  
  public static final Integer DEFAULT_IS_SIGNED;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final Integer DEFAULT_MEMBER_NUM;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final String DEFAULT_SECOND_CLASS = "";
  
  public static final List<FrsTabInfo> DEFAULT_TAB_INFO;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 17)
  public final DeletedReasonInfo deleted_reason_info;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String ext;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String first_class;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String forum_toutu;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer is_brand_forum;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_exists;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer is_frs_mask;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer is_liked;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer is_signed;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer level_id;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer member_num;
  
  @ProtoField(tag = 11)
  public final MultiForumPerm multi_forum_perm;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String second_class;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 15)
  public final List<FrsTabInfo> tab_info;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_EXISTS = integer;
    DEFAULT_IS_LIKED = integer;
    DEFAULT_IS_SIGNED = integer;
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_MEMBER_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_IS_BRAND_FORUM = integer;
    DEFAULT_TAB_INFO = Collections.emptyList();
    DEFAULT_IS_FRS_MASK = integer;
  }
  
  public SimpleForum(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      String str4 = paramBuilder.name;
      if (str4 == null) {
        this.name = "";
      } else {
        this.name = str4;
      } 
      Integer integer3 = paramBuilder.is_exists;
      if (integer3 == null) {
        this.is_exists = DEFAULT_IS_EXISTS;
      } else {
        this.is_exists = integer3;
      } 
      String str3 = paramBuilder.avatar;
      if (str3 == null) {
        this.avatar = "";
      } else {
        this.avatar = str3;
      } 
      Integer integer2 = paramBuilder.is_liked;
      if (integer2 == null) {
        this.is_liked = DEFAULT_IS_LIKED;
      } else {
        this.is_liked = integer2;
      } 
      integer2 = paramBuilder.is_signed;
      if (integer2 == null) {
        this.is_signed = DEFAULT_IS_SIGNED;
      } else {
        this.is_signed = integer2;
      } 
      String str2 = paramBuilder.first_class;
      if (str2 == null) {
        this.first_class = "";
      } else {
        this.first_class = str2;
      } 
      str2 = paramBuilder.second_class;
      if (str2 == null) {
        this.second_class = "";
      } else {
        this.second_class = str2;
      } 
      str2 = paramBuilder.ext;
      if (str2 == null) {
        this.ext = "";
      } else {
        this.ext = str2;
      } 
      Integer integer1 = paramBuilder.level_id;
      if (integer1 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer1;
      } 
      this.multi_forum_perm = paramBuilder.multi_forum_perm;
      integer1 = paramBuilder.member_num;
      if (integer1 == null) {
        this.member_num = DEFAULT_MEMBER_NUM;
      } else {
        this.member_num = integer1;
      } 
      integer1 = paramBuilder.post_num;
      if (integer1 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer1;
      } 
      integer1 = paramBuilder.is_brand_forum;
      if (integer1 == null) {
        this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
      } else {
        this.is_brand_forum = integer1;
      } 
      List list = paramBuilder.tab_info;
      if (list == null) {
        this.tab_info = DEFAULT_TAB_INFO;
      } else {
        this.tab_info = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.forum_toutu;
      if (str1 == null) {
        this.forum_toutu = "";
      } else {
        this.forum_toutu = str1;
      } 
      this.deleted_reason_info = paramBuilder.deleted_reason_info;
      integer = paramBuilder.is_frs_mask;
      if (integer == null) {
        this.is_frs_mask = DEFAULT_IS_FRS_MASK;
      } else {
        this.is_frs_mask = integer;
      } 
    } else {
      this.id = ((Builder)integer).id;
      this.name = ((Builder)integer).name;
      this.is_exists = ((Builder)integer).is_exists;
      this.avatar = ((Builder)integer).avatar;
      this.is_liked = ((Builder)integer).is_liked;
      this.is_signed = ((Builder)integer).is_signed;
      this.first_class = ((Builder)integer).first_class;
      this.second_class = ((Builder)integer).second_class;
      this.ext = ((Builder)integer).ext;
      this.level_id = ((Builder)integer).level_id;
      this.multi_forum_perm = ((Builder)integer).multi_forum_perm;
      this.member_num = ((Builder)integer).member_num;
      this.post_num = ((Builder)integer).post_num;
      this.is_brand_forum = ((Builder)integer).is_brand_forum;
      this.tab_info = Message.immutableCopyOf(((Builder)integer).tab_info);
      this.forum_toutu = ((Builder)integer).forum_toutu;
      this.deleted_reason_info = ((Builder)integer).deleted_reason_info;
      this.is_frs_mask = ((Builder)integer).is_frs_mask;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1000911222, "Ltbclient/SimpleForum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1000911222, "Ltbclient/SimpleForum;");
          return;
        } 
      } 
    } 
  }
}
