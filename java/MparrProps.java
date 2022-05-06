import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AvatarFrame;
import tbclient.Level;
import tbclient.MparrProps;
import tbclient.Portrait;
import tbclient.Props;

public final class MparrProps extends Message {
  public static final List<Props> DEFAULT_PROPS = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final AvatarFrame avatarframe;
  
  @ProtoField(tag = 3)
  public final Level level;
  
  @ProtoField(tag = 2)
  public final Portrait portrait;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<Props> props;
  
  public MparrProps(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      this.avatarframe = paramBuilder.avatarframe;
      this.portrait = paramBuilder.portrait;
      this.level = paramBuilder.level;
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.avatarframe = ((Builder)list).avatarframe;
      this.portrait = ((Builder)list).portrait;
      this.level = ((Builder)list).level;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(861759775, "Ltbclient/MparrProps;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(861759775, "Ltbclient/MparrProps;");
          return;
        } 
      } 
    } 
  }
}
