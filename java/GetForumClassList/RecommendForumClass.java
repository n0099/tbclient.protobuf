package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecommendForumClass extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final Long DEFAULT_FORUM_CLASS_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_IMAGE_URL = "";
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final String DEFAULT_RECOMMEND_IMAGE_URL = "";
  
  public static final String DEFAULT_RECOMMEND_TITLE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long forum_class_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String image_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String recommend_image_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String recommend_title;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  public RecommendForumClass(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.recommend_title;
      if (str2 == null) {
        this.recommend_title = "";
      } else {
        this.recommend_title = str2;
      } 
      str2 = paramBuilder.recommend_image_url;
      if (str2 == null) {
        this.recommend_image_url = "";
      } else {
        this.recommend_image_url = str2;
      } 
      str2 = paramBuilder.link_url;
      if (str2 == null) {
        this.link_url = "";
      } else {
        this.link_url = str2;
      } 
      Long long_ = paramBuilder.forum_class_id;
      if (long_ == null) {
        this.forum_class_id = DEFAULT_FORUM_CLASS_ID;
      } else {
        this.forum_class_id = long_;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder._abstract;
      if (str1 == null) {
        this._abstract = "";
      } else {
        this._abstract = str1;
      } 
      str = paramBuilder.image_url;
      if (str == null) {
        this.image_url = "";
      } else {
        this.image_url = str;
      } 
    } else {
      this.recommend_title = ((Builder)str).recommend_title;
      this.recommend_image_url = ((Builder)str).recommend_image_url;
      this.link_url = ((Builder)str).link_url;
      this.forum_class_id = ((Builder)str).forum_class_id;
      this.title = ((Builder)str).title;
      this._abstract = ((Builder)str)._abstract;
      this.image_url = ((Builder)str).image_url;
    } 
  }
  
  public RecommendForumClass(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecommendForumClass> {
    public String _abstract;
    
    public Long forum_class_id;
    
    public String image_url;
    
    public String link_url;
    
    public String recommend_image_url;
    
    public String recommend_title;
    
    public String title;
    
    public Builder() {}
    
    public Builder(RecommendForumClass param1RecommendForumClass) {
      super(param1RecommendForumClass);
      if (param1RecommendForumClass == null)
        return; 
      this.recommend_title = param1RecommendForumClass.recommend_title;
      this.recommend_image_url = param1RecommendForumClass.recommend_image_url;
      this.link_url = param1RecommendForumClass.link_url;
      this.forum_class_id = param1RecommendForumClass.forum_class_id;
      this.title = param1RecommendForumClass.title;
      this._abstract = param1RecommendForumClass._abstract;
      this.image_url = param1RecommendForumClass.image_url;
    }
    
    public RecommendForumClass build(boolean param1Boolean) {
      return new RecommendForumClass(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
