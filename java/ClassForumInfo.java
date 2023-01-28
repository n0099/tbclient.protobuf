package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ClassForumInfo extends Message {
  public static final String DEFAULT_CLASS_ICON = "";
  
  public static final Integer DEFAULT_CLASS_ID;
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final List<RecommendForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String class_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer class_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RecommendForumInfo> forum_info;
  
  static {
    DEFAULT_CLASS_ID = Integer.valueOf(0);
  }
  
  public ClassForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<RecommendForumInfo> list = paramBuilder.forum_info;
      if (list == null) {
        this.forum_info = DEFAULT_FORUM_INFO;
      } else {
        this.forum_info = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.class_id;
      if (integer == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer;
      } 
      String str1 = paramBuilder.class_name;
      if (str1 == null) {
        this.class_name = "";
      } else {
        this.class_name = str1;
      } 
      str = paramBuilder.class_icon;
      if (str == null) {
        this.class_icon = "";
      } else {
        this.class_icon = str;
      } 
    } else {
      this.forum_info = Message.immutableCopyOf(((Builder)str).forum_info);
      this.class_id = ((Builder)str).class_id;
      this.class_name = ((Builder)str).class_name;
      this.class_icon = ((Builder)str).class_icon;
    } 
  }
  
  public ClassForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ClassForumInfo> {
    public String class_icon;
    
    public Integer class_id;
    
    public String class_name;
    
    public List<RecommendForumInfo> forum_info;
    
    public Builder() {}
    
    public Builder(ClassForumInfo param1ClassForumInfo) {
      super(param1ClassForumInfo);
      if (param1ClassForumInfo == null)
        return; 
      this.forum_info = Message.copyOf(param1ClassForumInfo.forum_info);
      this.class_id = param1ClassForumInfo.class_id;
      this.class_name = param1ClassForumInfo.class_name;
      this.class_icon = param1ClassForumInfo.class_icon;
    }
    
    public ClassForumInfo build(boolean param1Boolean) {
      return new ClassForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
