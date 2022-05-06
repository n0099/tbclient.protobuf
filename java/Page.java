import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Page;

public final class Page extends Message {
  public static final Integer DEFAULT_CURRENT_PAGE;
  
  public static final Integer DEFAULT_CUR_GOOD_ID;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_HAS_PREV;
  
  public static final Integer DEFAULT_LZ_TOTAL_FLOOR;
  
  public static final Integer DEFAULT_NEW_TOTAL_PAGE;
  
  public static final Integer DEFAULT_OFFSET;
  
  public static final Integer DEFAULT_PAGE_SIZE;
  
  public static final Integer DEFAULT_PNUM;
  
  public static final Integer DEFAULT_REQ_NUM;
  
  public static final Integer DEFAULT_TNUM;
  
  public static final Integer DEFAULT_TOTAL_COUNT;
  
  public static final Integer DEFAULT_TOTAL_NUM;
  
  public static final Integer DEFAULT_TOTAL_PAGE;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer cur_good_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer current_page;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer has_prev;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer lz_total_floor;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer new_total_page;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer offset;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer page_size;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer pnum;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer req_num;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer tnum;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer total_count;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer total_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer total_page;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1091184414, "Ltbclient/Page;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1091184414, "Ltbclient/Page;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PAGE_SIZE = integer;
    DEFAULT_OFFSET = integer;
    DEFAULT_CURRENT_PAGE = integer;
    DEFAULT_TOTAL_COUNT = integer;
    DEFAULT_TOTAL_PAGE = integer;
    DEFAULT_HAS_MORE = integer;
    DEFAULT_HAS_PREV = integer;
    DEFAULT_CUR_GOOD_ID = integer;
    DEFAULT_REQ_NUM = integer;
    DEFAULT_PNUM = integer;
    DEFAULT_TNUM = integer;
    DEFAULT_TOTAL_NUM = integer;
    DEFAULT_LZ_TOTAL_FLOOR = integer;
    DEFAULT_NEW_TOTAL_PAGE = integer;
  }
  
  public Page(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.page_size;
      if (integer1 == null) {
        this.page_size = DEFAULT_PAGE_SIZE;
      } else {
        this.page_size = integer1;
      } 
      integer1 = paramBuilder.offset;
      if (integer1 == null) {
        this.offset = DEFAULT_OFFSET;
      } else {
        this.offset = integer1;
      } 
      integer1 = paramBuilder.current_page;
      if (integer1 == null) {
        this.current_page = DEFAULT_CURRENT_PAGE;
      } else {
        this.current_page = integer1;
      } 
      integer1 = paramBuilder.total_count;
      if (integer1 == null) {
        this.total_count = DEFAULT_TOTAL_COUNT;
      } else {
        this.total_count = integer1;
      } 
      integer1 = paramBuilder.total_page;
      if (integer1 == null) {
        this.total_page = DEFAULT_TOTAL_PAGE;
      } else {
        this.total_page = integer1;
      } 
      integer1 = paramBuilder.has_more;
      if (integer1 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer1;
      } 
      integer1 = paramBuilder.has_prev;
      if (integer1 == null) {
        this.has_prev = DEFAULT_HAS_PREV;
      } else {
        this.has_prev = integer1;
      } 
      integer1 = paramBuilder.cur_good_id;
      if (integer1 == null) {
        this.cur_good_id = DEFAULT_CUR_GOOD_ID;
      } else {
        this.cur_good_id = integer1;
      } 
      integer1 = paramBuilder.req_num;
      if (integer1 == null) {
        this.req_num = DEFAULT_REQ_NUM;
      } else {
        this.req_num = integer1;
      } 
      integer1 = paramBuilder.pnum;
      if (integer1 == null) {
        this.pnum = DEFAULT_PNUM;
      } else {
        this.pnum = integer1;
      } 
      integer1 = paramBuilder.tnum;
      if (integer1 == null) {
        this.tnum = DEFAULT_TNUM;
      } else {
        this.tnum = integer1;
      } 
      integer1 = paramBuilder.total_num;
      if (integer1 == null) {
        this.total_num = DEFAULT_TOTAL_NUM;
      } else {
        this.total_num = integer1;
      } 
      integer1 = paramBuilder.lz_total_floor;
      if (integer1 == null) {
        this.lz_total_floor = DEFAULT_LZ_TOTAL_FLOOR;
      } else {
        this.lz_total_floor = integer1;
      } 
      integer = paramBuilder.new_total_page;
      if (integer == null) {
        this.new_total_page = DEFAULT_NEW_TOTAL_PAGE;
      } else {
        this.new_total_page = integer;
      } 
    } else {
      this.page_size = ((Builder)integer).page_size;
      this.offset = ((Builder)integer).offset;
      this.current_page = ((Builder)integer).current_page;
      this.total_count = ((Builder)integer).total_count;
      this.total_page = ((Builder)integer).total_page;
      this.has_more = ((Builder)integer).has_more;
      this.has_prev = ((Builder)integer).has_prev;
      this.cur_good_id = ((Builder)integer).cur_good_id;
      this.req_num = ((Builder)integer).req_num;
      this.pnum = ((Builder)integer).pnum;
      this.tnum = ((Builder)integer).tnum;
      this.total_num = ((Builder)integer).total_num;
      this.lz_total_floor = ((Builder)integer).lz_total_floor;
      this.new_total_page = ((Builder)integer).new_total_page;
    } 
  }
}
