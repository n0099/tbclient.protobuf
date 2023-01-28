package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecommendForumInfo;

public final class RecommendForumList extends Message {
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final Integer DEFAULT_FLOOR_POSITION = Integer.valueOf(0);
  
  public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer floor_position;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<RecommendForumInfo> forum_list;
  
  public RecommendForumList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<RecommendForumInfo> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.floor_position;
      if (integer == null) {
        this.floor_position = DEFAULT_FLOOR_POSITION;
      } else {
        this.floor_position = integer;
      } 
      String str = paramBuilder.class_name;
      if (str == null) {
        this.class_name = "";
      } else {
        this.class_name = str;
      } 
      list = paramBuilder.forum_list;
      if (list == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.floor_position = ((Builder)list).floor_position;
      this.class_name = ((Builder)list).class_name;
      this.forum_list = Message.immutableCopyOf(((Builder)list).forum_list);
    } 
  }
  
  public RecommendForumList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecommendForumList> {
    public String class_name;
    
    public Integer floor_position;
    
    public List<RecommendForumInfo> forum_list;
    
    public Builder() {}
    
    public Builder(RecommendForumList param1RecommendForumList) {
      super(param1RecommendForumList);
      if (param1RecommendForumList == null)
        return; 
      this.floor_position = param1RecommendForumList.floor_position;
      this.class_name = param1RecommendForumList.class_name;
      this.forum_list = Message.copyOf(param1RecommendForumList.forum_list);
    }
    
    public RecommendForumList build(boolean param1Boolean) {
      return new RecommendForumList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
