package tbclient.ForumMenu;

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
import tbclient.CommonReq;
/* loaded from: classes3.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_COOKIE = "";
    public static final Integer DEFAULT_FORUM_ID;
    public static final Integer DEFAULT_ST_PARAM;
    public static final Integer DEFAULT_UPDATE_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f73719common;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String cookie;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer st_param;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer update_time;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f73720common;
        public String cookie;
        public Integer forum_id;
        public Integer st_param;
        public Integer update_time;

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
        public Builder(DataReq dataReq) {
            super(dataReq);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataReq};
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
            if (dataReq == null) {
                return;
            }
            this.update_time = dataReq.update_time;
            this.forum_id = dataReq.forum_id;
            this.st_param = dataReq.st_param;
            this.cookie = dataReq.cookie;
            this.f73720common = dataReq.f73719common;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1269147712, "Ltbclient/ForumMenu/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1269147712, "Ltbclient/ForumMenu/DataReq;");
                return;
            }
        }
        DEFAULT_UPDATE_TIME = 0;
        DEFAULT_FORUM_ID = 0;
        DEFAULT_ST_PARAM = 0;
    }

    public /* synthetic */ DataReq(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataReq(Builder builder, boolean z) {
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
            Integer num = builder.update_time;
            if (num == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num;
            }
            Integer num2 = builder.forum_id;
            if (num2 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = num2;
            }
            Integer num3 = builder.st_param;
            if (num3 == null) {
                this.st_param = DEFAULT_ST_PARAM;
            } else {
                this.st_param = num3;
            }
            String str = builder.cookie;
            if (str == null) {
                this.cookie = "";
            } else {
                this.cookie = str;
            }
            this.f73719common = builder.f73720common;
            return;
        }
        this.update_time = builder.update_time;
        this.forum_id = builder.forum_id;
        this.st_param = builder.st_param;
        this.cookie = builder.cookie;
        this.f73719common = builder.f73720common;
    }
}
