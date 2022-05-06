package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsPage.TabSkin;

public final class WorldcupSkin extends Message {
  public static final List<TabSkin> DEFAULT_TAB_SKIN;
  
  public static final String DEFAULT_WORLDCUP_BOTTOM = "";
  
  public static final String DEFAULT_WORLDCUP_BOTTOM_NIGHT = "";
  
  public static final Integer DEFAULT_WORLDCUP_ICON_HEIGHT = Integer.valueOf(0);
  
  public static final String DEFAULT_WORLDCUP_TOP = "";
  
  public static final String DEFAULT_WORLDCUP_TOP_NIGHT = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<TabSkin> tab_skin;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String worldcup_bottom;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String worldcup_bottom_night;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer worldcup_icon_height;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String worldcup_top;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String worldcup_top_night;
  
  static {
    DEFAULT_TAB_SKIN = Collections.emptyList();
  }
  
  public WorldcupSkin(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.worldcup_icon_height;
      if (integer == null) {
        this.worldcup_icon_height = DEFAULT_WORLDCUP_ICON_HEIGHT;
      } else {
        this.worldcup_icon_height = integer;
      } 
      String str = paramBuilder.worldcup_bottom;
      if (str == null) {
        this.worldcup_bottom = "";
      } else {
        this.worldcup_bottom = str;
      } 
      str = paramBuilder.worldcup_bottom_night;
      if (str == null) {
        this.worldcup_bottom_night = "";
      } else {
        this.worldcup_bottom_night = str;
      } 
      str = paramBuilder.worldcup_top;
      if (str == null) {
        this.worldcup_top = "";
      } else {
        this.worldcup_top = str;
      } 
      str = paramBuilder.worldcup_top_night;
      if (str == null) {
        this.worldcup_top_night = "";
      } else {
        this.worldcup_top_night = str;
      } 
      list = paramBuilder.tab_skin;
      if (list == null) {
        this.tab_skin = DEFAULT_TAB_SKIN;
      } else {
        this.tab_skin = Message.immutableCopyOf(list);
      } 
    } else {
      this.worldcup_icon_height = ((Builder)list).worldcup_icon_height;
      this.worldcup_bottom = ((Builder)list).worldcup_bottom;
      this.worldcup_bottom_night = ((Builder)list).worldcup_bottom_night;
      this.worldcup_top = ((Builder)list).worldcup_top;
      this.worldcup_top_night = ((Builder)list).worldcup_top_night;
      this.tab_skin = Message.immutableCopyOf(((Builder)list).tab_skin);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1786555505, "Ltbclient/FrsPage/WorldcupSkin;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1786555505, "Ltbclient/FrsPage/WorldcupSkin;");
          return;
        } 
      } 
    } 
  }
}
