package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeatureCardTopicSubNode extends Message {
  public static final Integer DEFAULT_ARTICLE_NUM;
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer article_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer update_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT_ARTICLE_NUM = integer;
  }
  
  public FeatureCardTopicSubNode(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.image;
      if (str2 == null) {
        this.image = "";
      } else {
        this.image = str2;
      } 
      Integer integer = paramBuilder.update_time;
      if (integer == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer;
      } 
      integer = paramBuilder.article_num;
      if (integer == null) {
        this.article_num = DEFAULT_ARTICLE_NUM;
      } else {
        this.article_num = integer;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.image = ((Builder)str).image;
      this.update_time = ((Builder)str).update_time;
      this.article_num = ((Builder)str).article_num;
      this.url = ((Builder)str).url;
      this.title = ((Builder)str).title;
    } 
  }
  
  public FeatureCardTopicSubNode(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FeatureCardTopicSubNode> {
    public Integer article_num;
    
    public String image;
    
    public String title;
    
    public Integer update_time;
    
    public String url;
    
    public Builder() {}
    
    public Builder(FeatureCardTopicSubNode param1FeatureCardTopicSubNode) {
      super(param1FeatureCardTopicSubNode);
      if (param1FeatureCardTopicSubNode == null)
        return; 
      this.image = param1FeatureCardTopicSubNode.image;
      this.update_time = param1FeatureCardTopicSubNode.update_time;
      this.article_num = param1FeatureCardTopicSubNode.article_num;
      this.url = param1FeatureCardTopicSubNode.url;
      this.title = param1FeatureCardTopicSubNode.title;
    }
    
    public FeatureCardTopicSubNode build(boolean param1Boolean) {
      return new FeatureCardTopicSubNode(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
