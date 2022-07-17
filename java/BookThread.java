package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BookThread extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BOOK_ID = "";
  
  public static final Integer DEFAULT_BOOK_TYPE = Integer.valueOf(0);
  
  public static final Long DEFAULT_CHAPTER_ID = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String book_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer book_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long chapter_id;
  
  public BookThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.book_id;
      if (str == null) {
        this.book_id = "";
      } else {
        this.book_id = str;
      } 
      Integer integer = paramBuilder.book_type;
      if (integer == null) {
        this.book_type = DEFAULT_BOOK_TYPE;
      } else {
        this.book_type = integer;
      } 
      long_ = paramBuilder.chapter_id;
      if (long_ == null) {
        this.chapter_id = DEFAULT_CHAPTER_ID;
      } else {
        this.chapter_id = long_;
      } 
    } else {
      this.book_id = ((Builder)long_).book_id;
      this.book_type = ((Builder)long_).book_type;
      this.chapter_id = ((Builder)long_).chapter_id;
    } 
  }
  
  public BookThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(332052766, "Ltbclient/BookThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(332052766, "Ltbclient/BookThread;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BookThread> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String book_id;
    
    public Integer book_type;
    
    public Long chapter_id;
    
    public Builder() {}
    
    public Builder(BookThread param1BookThread) {
      super(param1BookThread);
      if (param1BookThread == null)
        return; 
      this.book_id = param1BookThread.book_id;
      this.book_type = param1BookThread.book_type;
      this.chapter_id = param1BookThread.chapter_id;
    }
    
    public BookThread build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BookThread)interceptResult.objValue; 
      } 
      return new BookThread(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
