package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RecommendInfo extends Message {
  public static final String DEFAULT_TITLE = "";
  
  public static final List<SchoolRecomUserInfo> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<SchoolRecomUserInfo> user_list;
  
  public RecommendInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SchoolRecomUserInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.user_list = Message.immutableCopyOf(((Builder)list).user_list);
    } 
  }
  
  public RecommendInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecommendInfo> {
    public String title;
    
    public List<SchoolRecomUserInfo> user_list;
    
    public Builder() {}
    
    public Builder(RecommendInfo param1RecommendInfo) {
      super(param1RecommendInfo);
      if (param1RecommendInfo == null)
        return; 
      this.title = param1RecommendInfo.title;
      this.user_list = Message.copyOf(param1RecommendInfo.user_list);
    }
    
    public RecommendInfo build(boolean param1Boolean) {
      return new RecommendInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
