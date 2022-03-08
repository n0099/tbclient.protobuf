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
public final class DiscoverItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_DESCRIBE = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final Integer DEFAULT_IS_NEW;
    public static final Integer DEFAULT_IS_RED_POINT;
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_STATISTICS = "";
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String describe;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_new;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_red_point;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String statistics;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DiscoverItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String describe;
        public String icon_url;
        public Integer is_new;
        public Integer is_red_point;
        public String link_url;
        public String statistics;
        public String title;

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
        public Builder(DiscoverItem discoverItem) {
            super(discoverItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {discoverItem};
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
            if (discoverItem == null) {
                return;
            }
            this.icon_url = discoverItem.icon_url;
            this.title = discoverItem.title;
            this.link_url = discoverItem.link_url;
            this.is_new = discoverItem.is_new;
            this.describe = discoverItem.describe;
            this.statistics = discoverItem.statistics;
            this.is_red_point = discoverItem.is_red_point;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DiscoverItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DiscoverItem(this, z, null) : (DiscoverItem) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-10191320, "Ltbclient/HomePage/DiscoverItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-10191320, "Ltbclient/HomePage/DiscoverItem;");
                return;
            }
        }
        DEFAULT_IS_NEW = 0;
        DEFAULT_IS_RED_POINT = 0;
    }

    public /* synthetic */ DiscoverItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverItem(Builder builder, boolean z) {
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
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.link_url;
            if (str3 == null) {
                this.link_url = "";
            } else {
                this.link_url = str3;
            }
            Integer num = builder.is_new;
            if (num == null) {
                this.is_new = DEFAULT_IS_NEW;
            } else {
                this.is_new = num;
            }
            String str4 = builder.describe;
            if (str4 == null) {
                this.describe = "";
            } else {
                this.describe = str4;
            }
            String str5 = builder.statistics;
            if (str5 == null) {
                this.statistics = "";
            } else {
                this.statistics = str5;
            }
            Integer num2 = builder.is_red_point;
            if (num2 == null) {
                this.is_red_point = DEFAULT_IS_RED_POINT;
                return;
            } else {
                this.is_red_point = num2;
                return;
            }
        }
        this.icon_url = builder.icon_url;
        this.title = builder.title;
        this.link_url = builder.link_url;
        this.is_new = builder.is_new;
        this.describe = builder.describe;
        this.statistics = builder.statistics;
        this.is_red_point = builder.is_red_point;
    }
}
