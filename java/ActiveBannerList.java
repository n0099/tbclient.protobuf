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
/* loaded from: classes3.dex */
public final class ActiveBannerList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVE_DESC = "";
    public static final String DEFAULT_ACTIVE_NAME = "";
    public static final Integer DEFAULT_ACTIVE_TYPE;
    public static final String DEFAULT_ACTIVE_URL = "";
    public static final Integer DEFAULT_ID;
    public static final String DEFAULT_SKIP_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String active_desc;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String active_name;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer active_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String active_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String skip_url;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<ActiveBannerList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String active_desc;
        public String active_name;
        public Integer active_type;
        public String active_url;
        public Integer id;
        public String skip_url;

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
        public Builder(ActiveBannerList activeBannerList) {
            super(activeBannerList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {activeBannerList};
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
            if (activeBannerList == null) {
                return;
            }
            this.id = activeBannerList.id;
            this.active_name = activeBannerList.active_name;
            this.active_url = activeBannerList.active_url;
            this.active_desc = activeBannerList.active_desc;
            this.skip_url = activeBannerList.skip_url;
            this.active_type = activeBannerList.active_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActiveBannerList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ActiveBannerList(this, z, null) : (ActiveBannerList) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(660787457, "Ltbclient/ActiveBannerList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(660787457, "Ltbclient/ActiveBannerList;");
                return;
            }
        }
        DEFAULT_ID = 0;
        DEFAULT_ACTIVE_TYPE = 0;
    }

    public /* synthetic */ ActiveBannerList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveBannerList(Builder builder, boolean z) {
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
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.active_name;
            if (str == null) {
                this.active_name = "";
            } else {
                this.active_name = str;
            }
            String str2 = builder.active_url;
            if (str2 == null) {
                this.active_url = "";
            } else {
                this.active_url = str2;
            }
            String str3 = builder.active_desc;
            if (str3 == null) {
                this.active_desc = "";
            } else {
                this.active_desc = str3;
            }
            String str4 = builder.skip_url;
            if (str4 == null) {
                this.skip_url = "";
            } else {
                this.skip_url = str4;
            }
            Integer num2 = builder.active_type;
            if (num2 == null) {
                this.active_type = DEFAULT_ACTIVE_TYPE;
                return;
            } else {
                this.active_type = num2;
                return;
            }
        }
        this.id = builder.id;
        this.active_name = builder.active_name;
        this.active_url = builder.active_url;
        this.active_desc = builder.active_desc;
        this.skip_url = builder.skip_url;
        this.active_type = builder.active_type;
    }
}
