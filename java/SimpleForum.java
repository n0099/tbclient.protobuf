package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

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
  
  public static final String DEFAULT_RECOMMEND_TIP = "";
  
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
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String recommend_tip;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String second_class;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 15)
  public final List<FrsTabInfo> tab_info;
  
  @ProtoField(tag = 19)
  public final ThemeColorInfo theme_color;
  
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
    super(paramBuilder);
    String str;
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
      Integer integer4 = paramBuilder.is_exists;
      if (integer4 == null) {
        this.is_exists = DEFAULT_IS_EXISTS;
      } else {
        this.is_exists = integer4;
      } 
      String str3 = paramBuilder.avatar;
      if (str3 == null) {
        this.avatar = "";
      } else {
        this.avatar = str3;
      } 
      Integer integer3 = paramBuilder.is_liked;
      if (integer3 == null) {
        this.is_liked = DEFAULT_IS_LIKED;
      } else {
        this.is_liked = integer3;
      } 
      integer3 = paramBuilder.is_signed;
      if (integer3 == null) {
        this.is_signed = DEFAULT_IS_SIGNED;
      } else {
        this.is_signed = integer3;
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
      Integer integer2 = paramBuilder.level_id;
      if (integer2 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer2;
      } 
      this.multi_forum_perm = paramBuilder.multi_forum_perm;
      integer2 = paramBuilder.member_num;
      if (integer2 == null) {
        this.member_num = DEFAULT_MEMBER_NUM;
      } else {
        this.member_num = integer2;
      } 
      integer2 = paramBuilder.post_num;
      if (integer2 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer2;
      } 
      integer2 = paramBuilder.is_brand_forum;
      if (integer2 == null) {
        this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
      } else {
        this.is_brand_forum = integer2;
      } 
      List<FrsTabInfo> list = paramBuilder.tab_info;
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
      Integer integer1 = paramBuilder.is_frs_mask;
      if (integer1 == null) {
        this.is_frs_mask = DEFAULT_IS_FRS_MASK;
      } else {
        this.is_frs_mask = integer1;
      } 
      this.theme_color = paramBuilder.theme_color;
      str = paramBuilder.recommend_tip;
      if (str == null) {
        this.recommend_tip = "";
      } else {
        this.recommend_tip = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
      this.is_exists = ((Builder)str).is_exists;
      this.avatar = ((Builder)str).avatar;
      this.is_liked = ((Builder)str).is_liked;
      this.is_signed = ((Builder)str).is_signed;
      this.first_class = ((Builder)str).first_class;
      this.second_class = ((Builder)str).second_class;
      this.ext = ((Builder)str).ext;
      this.level_id = ((Builder)str).level_id;
      this.multi_forum_perm = ((Builder)str).multi_forum_perm;
      this.member_num = ((Builder)str).member_num;
      this.post_num = ((Builder)str).post_num;
      this.is_brand_forum = ((Builder)str).is_brand_forum;
      this.tab_info = Message.immutableCopyOf(((Builder)str).tab_info);
      this.forum_toutu = ((Builder)str).forum_toutu;
      this.deleted_reason_info = ((Builder)str).deleted_reason_info;
      this.is_frs_mask = ((Builder)str).is_frs_mask;
      this.theme_color = ((Builder)str).theme_color;
      this.recommend_tip = ((Builder)str).recommend_tip;
    } 
  }
  
  public SimpleForum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SimpleForum> {
    public String avatar;
    
    public DeletedReasonInfo deleted_reason_info;
    
    public String ext;
    
    public String first_class;
    
    public String forum_toutu;
    
    public Long id;
    
    public Integer is_brand_forum;
    
    public Integer is_exists;
    
    public Integer is_frs_mask;
    
    public Integer is_liked;
    
    public Integer is_signed;
    
    public Integer level_id;
    
    public Integer member_num;
    
    public MultiForumPerm multi_forum_perm;
    
    public String name;
    
    public Integer post_num;
    
    public String recommend_tip;
    
    public String second_class;
    
    public List<FrsTabInfo> tab_info;
    
    public ThemeColorInfo theme_color;
    
    public Builder() {}
    
    public Builder(SimpleForum param1SimpleForum) {
      super(param1SimpleForum);
      if (param1SimpleForum == null)
        return; 
      this.id = param1SimpleForum.id;
      this.name = param1SimpleForum.name;
      this.is_exists = param1SimpleForum.is_exists;
      this.avatar = param1SimpleForum.avatar;
      this.is_liked = param1SimpleForum.is_liked;
      this.is_signed = param1SimpleForum.is_signed;
      this.first_class = param1SimpleForum.first_class;
      this.second_class = param1SimpleForum.second_class;
      this.ext = param1SimpleForum.ext;
      this.level_id = param1SimpleForum.level_id;
      this.multi_forum_perm = param1SimpleForum.multi_forum_perm;
      this.member_num = param1SimpleForum.member_num;
      this.post_num = param1SimpleForum.post_num;
      this.is_brand_forum = param1SimpleForum.is_brand_forum;
      this.tab_info = Message.copyOf(param1SimpleForum.tab_info);
      this.forum_toutu = param1SimpleForum.forum_toutu;
      this.deleted_reason_info = param1SimpleForum.deleted_reason_info;
      this.is_frs_mask = param1SimpleForum.is_frs_mask;
      this.theme_color = param1SimpleForum.theme_color;
      this.recommend_tip = param1SimpleForum.recommend_tip;
    }
    
    public SimpleForum build(boolean param1Boolean) {
      return new SimpleForum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
