package tbclient.RecomVideo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ThreadPersonalized extends Message {
  public static final String DEFAULT_ABTEST_TAG = "";
  
  public static final List<DislikeReason> DEFAULT_DISLIKE_RESOURCE;
  
  public static final String DEFAULT_EXTRA = "";
  
  public static final String DEFAULT_SOURCE = "";
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  public static final String DEFAULT_WEIGHT = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String abtest_tag;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<DislikeReason> dislike_resource;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String extra;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String source;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String weight;
  
  static {
    DEFAULT_DISLIKE_RESOURCE = Collections.emptyList();
  }
  
  public ThreadPersonalized(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      String str1 = paramBuilder.weight;
      if (str1 == null) {
        this.weight = "";
      } else {
        this.weight = str1;
      } 
      str1 = paramBuilder.source;
      if (str1 == null) {
        this.source = "";
      } else {
        this.source = str1;
      } 
      str1 = paramBuilder.abtest_tag;
      if (str1 == null) {
        this.abtest_tag = "";
      } else {
        this.abtest_tag = str1;
      } 
      List<DislikeReason> list = paramBuilder.dislike_resource;
      if (list == null) {
        this.dislike_resource = DEFAULT_DISLIKE_RESOURCE;
      } else {
        this.dislike_resource = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.extra;
      if (str == null) {
        this.extra = "";
      } else {
        this.extra = str;
      } 
    } else {
      this.tid = ((Builder)str).tid;
      this.weight = ((Builder)str).weight;
      this.source = ((Builder)str).source;
      this.abtest_tag = ((Builder)str).abtest_tag;
      this.dislike_resource = Message.immutableCopyOf(((Builder)str).dislike_resource);
      this.extra = ((Builder)str).extra;
    } 
  }
  
  public ThreadPersonalized(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadPersonalized> {
    public String abtest_tag;
    
    public List<DislikeReason> dislike_resource;
    
    public String extra;
    
    public String source;
    
    public Long tid;
    
    public String weight;
    
    public Builder() {}
    
    public Builder(ThreadPersonalized param1ThreadPersonalized) {
      super(param1ThreadPersonalized);
      if (param1ThreadPersonalized == null)
        return; 
      this.tid = param1ThreadPersonalized.tid;
      this.weight = param1ThreadPersonalized.weight;
      this.source = param1ThreadPersonalized.source;
      this.abtest_tag = param1ThreadPersonalized.abtest_tag;
      this.dislike_resource = Message.copyOf(param1ThreadPersonalized.dislike_resource);
      this.extra = param1ThreadPersonalized.extra;
    }
    
    public ThreadPersonalized build(boolean param1Boolean) {
      return new ThreadPersonalized(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
