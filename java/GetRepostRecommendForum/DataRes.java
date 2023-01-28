package tbclient.GetRepostRecommendForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SimpleForum;

public final class DataRes extends Message {
  public static final Integer DEFAULT_PRIV_THREAD;
  
  public static final String DEFAULT_RECOMMEND_EXT = "";
  
  public static final List<SimpleForum> DEFAULT_RECOMMEND_FORUM_LIST = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer priv_thread;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String recommend_ext;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<SimpleForum> recommend_forum_list;
  
  static {
    DEFAULT_PRIV_THREAD = Integer.valueOf(0);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<SimpleForum> list = paramBuilder.recommend_forum_list;
      if (list == null) {
        this.recommend_forum_list = DEFAULT_RECOMMEND_FORUM_LIST;
      } else {
        this.recommend_forum_list = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.recommend_ext;
      if (str == null) {
        this.recommend_ext = "";
      } else {
        this.recommend_ext = str;
      } 
      integer = paramBuilder.priv_thread;
      if (integer == null) {
        this.priv_thread = DEFAULT_PRIV_THREAD;
      } else {
        this.priv_thread = integer;
      } 
    } else {
      this.recommend_forum_list = Message.immutableCopyOf(((Builder)integer).recommend_forum_list);
      this.recommend_ext = ((Builder)integer).recommend_ext;
      this.priv_thread = ((Builder)integer).priv_thread;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer priv_thread;
    
    public String recommend_ext;
    
    public List<SimpleForum> recommend_forum_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.recommend_forum_list = Message.copyOf(param1DataRes.recommend_forum_list);
      this.recommend_ext = param1DataRes.recommend_ext;
      this.priv_thread = param1DataRes.priv_thread;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
