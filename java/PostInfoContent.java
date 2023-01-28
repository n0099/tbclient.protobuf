package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PostInfoContent extends Message {
  public static final Long DEFAULT_CREATE_TIME;
  
  public static final Integer DEFAULT_IS_AUTHOR_VIEW;
  
  public static final List<Abstract> DEFAULT_POST_CONTENT = Collections.emptyList();
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Long DEFAULT_POST_TYPE;
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long create_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_author_view;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Abstract> post_content;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long post_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_CREATE_TIME = long_;
    DEFAULT_POST_TYPE = long_;
    DEFAULT_POST_ID = long_;
    DEFAULT_IS_AUTHOR_VIEW = Integer.valueOf(0);
  }
  
  public PostInfoContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<Abstract> list = paramBuilder.post_content;
      if (list == null) {
        this.post_content = DEFAULT_POST_CONTENT;
      } else {
        this.post_content = Message.immutableCopyOf(list);
      } 
      Long long_ = paramBuilder.create_time;
      if (long_ == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = long_;
      } 
      long_ = paramBuilder.post_type;
      if (long_ == null) {
        this.post_type = DEFAULT_POST_TYPE;
      } else {
        this.post_type = long_;
      } 
      long_ = paramBuilder.post_id;
      if (long_ == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_;
      } 
      Integer integer = paramBuilder.is_author_view;
      if (integer == null) {
        this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
      } else {
        this.is_author_view = integer;
      } 
      str = paramBuilder.target_scheme;
      if (str == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str;
      } 
    } else {
      this.post_content = Message.immutableCopyOf(((Builder)str).post_content);
      this.create_time = ((Builder)str).create_time;
      this.post_type = ((Builder)str).post_type;
      this.post_id = ((Builder)str).post_id;
      this.is_author_view = ((Builder)str).is_author_view;
      this.target_scheme = ((Builder)str).target_scheme;
    } 
  }
  
  public PostInfoContent(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PostInfoContent> {
    public Long create_time;
    
    public Integer is_author_view;
    
    public List<Abstract> post_content;
    
    public Long post_id;
    
    public Long post_type;
    
    public String target_scheme;
    
    public Builder() {}
    
    public Builder(PostInfoContent param1PostInfoContent) {
      super(param1PostInfoContent);
      if (param1PostInfoContent == null)
        return; 
      this.post_content = Message.copyOf(param1PostInfoContent.post_content);
      this.create_time = param1PostInfoContent.create_time;
      this.post_type = param1PostInfoContent.post_type;
      this.post_id = param1PostInfoContent.post_id;
      this.is_author_view = param1PostInfoContent.is_author_view;
      this.target_scheme = param1PostInfoContent.target_scheme;
    }
    
    public PostInfoContent build(boolean param1Boolean) {
      return new PostInfoContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
