package tbclient.QueryBlockAndAppealInfo;

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
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AHEAD_INFO = "";
    public static final String DEFAULT_AHEAD_URL = "";
    public static final String DEFAULT_BLOCK_ID_CODE = "";
    public static final String DEFAULT_BLOCK_INFO = "";
    public static final String DEFAULT_OK_INFO = "";
    public static final Integer DEFAULT_WIN_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ahead_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String block_id_code;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String block_info;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ok_info;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer win_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String ahead_info;
        public String ahead_url;
        public String block_id_code;
        public String block_info;
        public String ok_info;
        public Integer win_type;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.block_info = dataRes.block_info;
            this.ahead_info = dataRes.ahead_info;
            this.ahead_url = dataRes.ahead_url;
            this.ok_info = dataRes.ok_info;
            this.block_id_code = dataRes.block_id_code;
            this.win_type = dataRes.win_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1921001969, "Ltbclient/QueryBlockAndAppealInfo/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1921001969, "Ltbclient/QueryBlockAndAppealInfo/DataRes;");
                return;
            }
        }
        DEFAULT_WIN_TYPE = 0;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            String str = builder.block_info;
            if (str == null) {
                this.block_info = "";
            } else {
                this.block_info = str;
            }
            String str2 = builder.ahead_info;
            if (str2 == null) {
                this.ahead_info = "";
            } else {
                this.ahead_info = str2;
            }
            String str3 = builder.ahead_url;
            if (str3 == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = str3;
            }
            String str4 = builder.ok_info;
            if (str4 == null) {
                this.ok_info = "";
            } else {
                this.ok_info = str4;
            }
            String str5 = builder.block_id_code;
            if (str5 == null) {
                this.block_id_code = "";
            } else {
                this.block_id_code = str5;
            }
            Integer num = builder.win_type;
            if (num == null) {
                this.win_type = DEFAULT_WIN_TYPE;
                return;
            } else {
                this.win_type = num;
                return;
            }
        }
        this.block_info = builder.block_info;
        this.ahead_info = builder.ahead_info;
        this.ahead_url = builder.ahead_url;
        this.ok_info = builder.ok_info;
        this.block_id_code = builder.block_id_code;
        this.win_type = builder.win_type;
    }
}
