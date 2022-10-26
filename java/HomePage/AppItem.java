package tbclient.HomePage;

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
/* loaded from: classes9.dex */
public final class AppItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_APP_ICON = "";
    public static final String DEFAULT_APP_LINK = "";
    public static final String DEFAULT_APP_NAME = "";
    public static final Integer DEFAULT_ICON_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String app_icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String app_link;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String app_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer icon_type;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String app_icon;
        public String app_link;
        public String app_name;
        public Integer icon_type;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(AppItem appItem) {
            super(appItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {appItem};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (appItem == null) {
                return;
            }
            this.app_name = appItem.app_name;
            this.app_icon = appItem.app_icon;
            this.app_link = appItem.app_link;
            this.icon_type = appItem.icon_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AppItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new AppItem(this, z, null);
            }
            return (AppItem) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1162507070, "Ltbclient/HomePage/AppItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1162507070, "Ltbclient/HomePage/AppItem;");
                return;
            }
        }
        DEFAULT_ICON_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppItem(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.app_name;
            if (str == null) {
                this.app_name = "";
            } else {
                this.app_name = str;
            }
            String str2 = builder.app_icon;
            if (str2 == null) {
                this.app_icon = "";
            } else {
                this.app_icon = str2;
            }
            String str3 = builder.app_link;
            if (str3 == null) {
                this.app_link = "";
            } else {
                this.app_link = str3;
            }
            Integer num = builder.icon_type;
            if (num == null) {
                this.icon_type = DEFAULT_ICON_TYPE;
                return;
            } else {
                this.icon_type = num;
                return;
            }
        }
        this.app_name = builder.app_name;
        this.app_icon = builder.app_icon;
        this.app_link = builder.app_link;
        this.icon_type = builder.icon_type;
    }

    public /* synthetic */ AppItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
