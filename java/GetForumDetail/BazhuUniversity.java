package tbclient.GetForumDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BazhuUniversity extends Message {
  public static Interceptable $ic;
  
  public static final List<UniversityInfo> DEFAULT_BANNER;
  
  public static final List<UniversityInfo> DEFAULT_ENTRANCE = Collections.emptyList();
  
  public static final List<UniversityTabInfo> DEFAULT_TAB;
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<UniversityInfo> banner;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<UniversityInfo> entrance;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<UniversityTabInfo> tab;
  
  static {
    DEFAULT_BANNER = Collections.emptyList();
    DEFAULT_TAB = Collections.emptyList();
  }
  
  public BazhuUniversity(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<UniversityTabInfo> list;
    if (paramBoolean == true) {
      List<UniversityInfo> list1 = paramBuilder.entrance;
      if (list1 == null) {
        this.entrance = DEFAULT_ENTRANCE;
      } else {
        this.entrance = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.banner;
      if (list1 == null) {
        this.banner = DEFAULT_BANNER;
      } else {
        this.banner = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.tab;
      if (list == null) {
        this.tab = DEFAULT_TAB;
      } else {
        this.tab = Message.immutableCopyOf(list);
      } 
    } else {
      this.entrance = Message.immutableCopyOf(((Builder)list).entrance);
      this.banner = Message.immutableCopyOf(((Builder)list).banner);
      this.tab = Message.immutableCopyOf(((Builder)list).tab);
    } 
  }
  
  public BazhuUniversity(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(99504110, "Ltbclient/GetForumDetail/BazhuUniversity;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(99504110, "Ltbclient/GetForumDetail/BazhuUniversity;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BazhuUniversity> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<UniversityInfo> banner;
    
    public List<UniversityInfo> entrance;
    
    public List<UniversityTabInfo> tab;
    
    public Builder() {}
    
    public Builder(BazhuUniversity param1BazhuUniversity) {
      super(param1BazhuUniversity);
      if (param1BazhuUniversity == null)
        return; 
      this.entrance = Message.copyOf(param1BazhuUniversity.entrance);
      this.banner = Message.copyOf(param1BazhuUniversity.banner);
      this.tab = Message.copyOf(param1BazhuUniversity.tab);
    }
    
    public BazhuUniversity build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BazhuUniversity)interceptResult.objValue; 
      } 
      return new BazhuUniversity(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
