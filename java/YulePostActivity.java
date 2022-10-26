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
/* loaded from: classes9.dex */
public final class YulePostActivity extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVITY_BANNER = "";
    public static final String DEFAULT_ACTIVITY_BUTTON = "";
    public static final String DEFAULT_ACTIVITY_DESC = "";
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final Long DEFAULT_END_TIME;
    public static final Long DEFAULT_START_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String activity_banner;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String activity_button;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String activity_desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long end_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long start_time;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String activity_banner;
        public String activity_button;
        public String activity_desc;
        public String activity_url;
        public Long end_time;
        public Long start_time;

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
        public Builder(YulePostActivity yulePostActivity) {
            super(yulePostActivity);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {yulePostActivity};
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
            if (yulePostActivity == null) {
                return;
            }
            this.start_time = yulePostActivity.start_time;
            this.end_time = yulePostActivity.end_time;
            this.activity_banner = yulePostActivity.activity_banner;
            this.activity_url = yulePostActivity.activity_url;
            this.activity_desc = yulePostActivity.activity_desc;
            this.activity_button = yulePostActivity.activity_button;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public YulePostActivity build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new YulePostActivity(this, z, null);
            }
            return (YulePostActivity) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1236477709, "Ltbclient/YulePostActivity;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1236477709, "Ltbclient/YulePostActivity;");
                return;
            }
        }
        DEFAULT_START_TIME = 0L;
        DEFAULT_END_TIME = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YulePostActivity(Builder builder, boolean z) {
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
            Long l = builder.start_time;
            if (l == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l;
            }
            Long l2 = builder.end_time;
            if (l2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = l2;
            }
            String str = builder.activity_banner;
            if (str == null) {
                this.activity_banner = "";
            } else {
                this.activity_banner = str;
            }
            String str2 = builder.activity_url;
            if (str2 == null) {
                this.activity_url = "";
            } else {
                this.activity_url = str2;
            }
            String str3 = builder.activity_desc;
            if (str3 == null) {
                this.activity_desc = "";
            } else {
                this.activity_desc = str3;
            }
            String str4 = builder.activity_button;
            if (str4 == null) {
                this.activity_button = "";
                return;
            } else {
                this.activity_button = str4;
                return;
            }
        }
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.activity_banner = builder.activity_banner;
        this.activity_url = builder.activity_url;
        this.activity_desc = builder.activity_desc;
        this.activity_button = builder.activity_button;
    }

    public /* synthetic */ YulePostActivity(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
