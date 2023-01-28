package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ChatRoomAtInfo extends Message {
  public static final Integer DEFAULT_AT_ALL_MSG_COUNT;
  
  public static final List<AtMsgBase> DEFAULT_AT_ALL_MSG_LIST;
  
  public static final Integer DEFAULT_AT_COUNT_ALL;
  
  public static final Integer DEFAULT_AT_SINGLE_MSG_COUNT;
  
  public static final List<AtMsgBase> DEFAULT_AT_SINGLE_MSG_LIST;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer at_all_msg_count;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<AtMsgBase> at_all_msg_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer at_count_all;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer at_single_msg_count;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<AtMsgBase> at_single_msg_list;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_AT_COUNT_ALL = integer;
    DEFAULT_AT_ALL_MSG_COUNT = integer;
    DEFAULT_AT_SINGLE_MSG_COUNT = integer;
    DEFAULT_AT_ALL_MSG_LIST = Collections.emptyList();
    DEFAULT_AT_SINGLE_MSG_LIST = Collections.emptyList();
  }
  
  public ChatRoomAtInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<AtMsgBase> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.at_count_all;
      if (integer == null) {
        this.at_count_all = DEFAULT_AT_COUNT_ALL;
      } else {
        this.at_count_all = integer;
      } 
      integer = paramBuilder.at_all_msg_count;
      if (integer == null) {
        this.at_all_msg_count = DEFAULT_AT_ALL_MSG_COUNT;
      } else {
        this.at_all_msg_count = integer;
      } 
      integer = paramBuilder.at_single_msg_count;
      if (integer == null) {
        this.at_single_msg_count = DEFAULT_AT_SINGLE_MSG_COUNT;
      } else {
        this.at_single_msg_count = integer;
      } 
      List<AtMsgBase> list1 = paramBuilder.at_all_msg_list;
      if (list1 == null) {
        this.at_all_msg_list = DEFAULT_AT_ALL_MSG_LIST;
      } else {
        this.at_all_msg_list = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.at_single_msg_list;
      if (list == null) {
        this.at_single_msg_list = DEFAULT_AT_SINGLE_MSG_LIST;
      } else {
        this.at_single_msg_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.at_count_all = ((Builder)list).at_count_all;
      this.at_all_msg_count = ((Builder)list).at_all_msg_count;
      this.at_single_msg_count = ((Builder)list).at_single_msg_count;
      this.at_all_msg_list = Message.immutableCopyOf(((Builder)list).at_all_msg_list);
      this.at_single_msg_list = Message.immutableCopyOf(((Builder)list).at_single_msg_list);
    } 
  }
  
  public ChatRoomAtInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ChatRoomAtInfo> {
    public Integer at_all_msg_count;
    
    public List<AtMsgBase> at_all_msg_list;
    
    public Integer at_count_all;
    
    public Integer at_single_msg_count;
    
    public List<AtMsgBase> at_single_msg_list;
    
    public Builder() {}
    
    public Builder(ChatRoomAtInfo param1ChatRoomAtInfo) {
      super(param1ChatRoomAtInfo);
      if (param1ChatRoomAtInfo == null)
        return; 
      this.at_count_all = param1ChatRoomAtInfo.at_count_all;
      this.at_all_msg_count = param1ChatRoomAtInfo.at_all_msg_count;
      this.at_single_msg_count = param1ChatRoomAtInfo.at_single_msg_count;
      this.at_all_msg_list = Message.copyOf(param1ChatRoomAtInfo.at_all_msg_list);
      this.at_single_msg_list = Message.copyOf(param1ChatRoomAtInfo.at_single_msg_list);
    }
    
    public ChatRoomAtInfo build(boolean param1Boolean) {
      return new ChatRoomAtInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
