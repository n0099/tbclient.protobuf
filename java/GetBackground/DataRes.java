package tbclient.GetBackground;

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
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final Integer DEFAULT_DAILY_PRIVILEGE_STATUS;
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Integer DEFAULT_FREE_USER_LEVEL;
    public static final Integer DEFAULT_IS_FINISHED;
    public static final String DEFAULT_PERMISSION = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_PROPS_STATE_IMG = "";
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer daily_privilege_status;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer free_user_level;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_finished;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String permission;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String props_state_img;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String activity_url;
        public Integer daily_privilege_status;
        public String description;
        public Integer free_user_level;
        public Integer is_finished;
        public String permission;
        public String pic_url;
        public String props_state_img;
        public String title;

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
            this.title = dataRes.title;
            this.description = dataRes.description;
            this.pic_url = dataRes.pic_url;
            this.permission = dataRes.permission;
            this.props_state_img = dataRes.props_state_img;
            this.activity_url = dataRes.activity_url;
            this.free_user_level = dataRes.free_user_level;
            this.is_finished = dataRes.is_finished;
            this.daily_privilege_status = dataRes.daily_privilege_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DataRes(this, z, null);
            }
            return (DataRes) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2043066246, "Ltbclient/GetBackground/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2043066246, "Ltbclient/GetBackground/DataRes;");
                return;
            }
        }
        DEFAULT_FREE_USER_LEVEL = 0;
        DEFAULT_IS_FINISHED = 0;
        DEFAULT_DAILY_PRIVILEGE_STATUS = 0;
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
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.description;
            if (str2 == null) {
                this.description = "";
            } else {
                this.description = str2;
            }
            String str3 = builder.pic_url;
            if (str3 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str3;
            }
            String str4 = builder.permission;
            if (str4 == null) {
                this.permission = "";
            } else {
                this.permission = str4;
            }
            String str5 = builder.props_state_img;
            if (str5 == null) {
                this.props_state_img = "";
            } else {
                this.props_state_img = str5;
            }
            String str6 = builder.activity_url;
            if (str6 == null) {
                this.activity_url = "";
            } else {
                this.activity_url = str6;
            }
            Integer num = builder.free_user_level;
            if (num == null) {
                this.free_user_level = DEFAULT_FREE_USER_LEVEL;
            } else {
                this.free_user_level = num;
            }
            Integer num2 = builder.is_finished;
            if (num2 == null) {
                this.is_finished = DEFAULT_IS_FINISHED;
            } else {
                this.is_finished = num2;
            }
            Integer num3 = builder.daily_privilege_status;
            if (num3 == null) {
                this.daily_privilege_status = DEFAULT_DAILY_PRIVILEGE_STATUS;
                return;
            } else {
                this.daily_privilege_status = num3;
                return;
            }
        }
        this.title = builder.title;
        this.description = builder.description;
        this.pic_url = builder.pic_url;
        this.permission = builder.permission;
        this.props_state_img = builder.props_state_img;
        this.activity_url = builder.activity_url;
        this.free_user_level = builder.free_user_level;
        this.is_finished = builder.is_finished;
        this.daily_privilege_status = builder.daily_privilege_status;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
