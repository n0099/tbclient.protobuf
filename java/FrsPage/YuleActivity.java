package tbclient.FrsPage;

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
public final class YuleActivity extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVITY_ALL_ICON = "";
    public static final String DEFAULT_ACTIVITY_HALF_ICON = "";
    public static final Long DEFAULT_ACTIVITY_ID;
    public static final Integer DEFAULT_ACTIVITY_TYPE;
    public static final String DEFAULT_ACTIVITY_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String activity_all_icon;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String activity_half_icon;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long activity_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer activity_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String activity_url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<YuleActivity> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String activity_all_icon;
        public String activity_half_icon;
        public Long activity_id;
        public Integer activity_type;
        public String activity_url;

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
        public Builder(YuleActivity yuleActivity) {
            super(yuleActivity);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {yuleActivity};
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
            if (yuleActivity == null) {
                return;
            }
            this.activity_id = yuleActivity.activity_id;
            this.activity_type = yuleActivity.activity_type;
            this.activity_url = yuleActivity.activity_url;
            this.activity_all_icon = yuleActivity.activity_all_icon;
            this.activity_half_icon = yuleActivity.activity_half_icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public YuleActivity build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new YuleActivity(this, z, null) : (YuleActivity) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-250733516, "Ltbclient/FrsPage/YuleActivity;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-250733516, "Ltbclient/FrsPage/YuleActivity;");
                return;
            }
        }
        DEFAULT_ACTIVITY_ID = 0L;
        DEFAULT_ACTIVITY_TYPE = 0;
    }

    public /* synthetic */ YuleActivity(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YuleActivity(Builder builder, boolean z) {
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
            Long l = builder.activity_id;
            if (l == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = l;
            }
            Integer num = builder.activity_type;
            if (num == null) {
                this.activity_type = DEFAULT_ACTIVITY_TYPE;
            } else {
                this.activity_type = num;
            }
            String str = builder.activity_url;
            if (str == null) {
                this.activity_url = "";
            } else {
                this.activity_url = str;
            }
            String str2 = builder.activity_all_icon;
            if (str2 == null) {
                this.activity_all_icon = "";
            } else {
                this.activity_all_icon = str2;
            }
            String str3 = builder.activity_half_icon;
            if (str3 == null) {
                this.activity_half_icon = "";
                return;
            } else {
                this.activity_half_icon = str3;
                return;
            }
        }
        this.activity_id = builder.activity_id;
        this.activity_type = builder.activity_type;
        this.activity_url = builder.activity_url;
        this.activity_all_icon = builder.activity_all_icon;
        this.activity_half_icon = builder.activity_half_icon;
    }
}
