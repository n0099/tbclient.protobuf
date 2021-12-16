package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public final class Icon extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    public static final List<String> DEFAULT_SPRITE_INFO;
    public static final String DEFAULT_URL = "";
    public static final Integer DEFAULT_VALUE;
    public static final Integer DEFAULT_WEIGHT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 7)
    public final Position position;
    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
    public final List<String> sprite_info;
    @ProtoField(tag = 6)
    public final Terminal terminal;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer value;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer weight;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<Icon> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String icon;
        public String name;
        public Position position;
        public List<String> sprite_info;
        public Terminal terminal;
        public String url;
        public Integer value;
        public Integer weight;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Icon icon) {
            super(icon);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {icon};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (icon == null) {
                return;
            }
            this.name = icon.name;
            this.weight = icon.weight;
            this.url = icon.url;
            this.icon = icon.icon;
            this.value = icon.value;
            this.terminal = icon.terminal;
            this.position = icon.position;
            this.sprite_info = Message.copyOf(icon.sprite_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Icon build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Icon(this, z, null) : (Icon) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1097581512, "Ltbclient/Icon;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1097581512, "Ltbclient/Icon;");
                return;
            }
        }
        DEFAULT_WEIGHT = 0;
        DEFAULT_VALUE = 0;
        DEFAULT_SPRITE_INFO = Collections.emptyList();
    }

    public /* synthetic */ Icon(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Icon(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num = builder.weight;
            if (num == null) {
                this.weight = DEFAULT_WEIGHT;
            } else {
                this.weight = num;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
            } else {
                this.url = str2;
            }
            String str3 = builder.icon;
            if (str3 == null) {
                this.icon = "";
            } else {
                this.icon = str3;
            }
            Integer num2 = builder.value;
            if (num2 == null) {
                this.value = DEFAULT_VALUE;
            } else {
                this.value = num2;
            }
            this.terminal = builder.terminal;
            this.position = builder.position;
            List<String> list = builder.sprite_info;
            if (list == null) {
                this.sprite_info = DEFAULT_SPRITE_INFO;
                return;
            } else {
                this.sprite_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.name = builder.name;
        this.weight = builder.weight;
        this.url = builder.url;
        this.icon = builder.icon;
        this.value = builder.value;
        this.terminal = builder.terminal;
        this.position = builder.position;
        this.sprite_info = Message.immutableCopyOf(builder.sprite_info);
    }
}
