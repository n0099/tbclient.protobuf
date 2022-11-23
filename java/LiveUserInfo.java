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
public final class LiveUserInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_ALA_ID;
    public static final Integer DEFAULT_CHARM_COUNT;
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Integer DEFAULT_FANS_COUNT;
    public static final Integer DEFAULT_FOLLOW_COUNT;
    public static final Double DEFAULT_LAT;
    public static final Integer DEFAULT_LEVEL_EXP;
    public static final Integer DEFAULT_LEVEL_ID;
    public static final Double DEFAULT_LNG;
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_SEX;
    public static final Long DEFAULT_USER_ID;
    public static final String DEFAULT_USER_NAME = "";
    public static final Integer DEFAULT_USER_STATUS;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long ala_id;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer charm_count;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer fans_count;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer follow_count;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double lat;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer level_exp;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer level_id;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double lng;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer sex;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer user_status;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveUserInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long ala_id;
        public Integer charm_count;
        public String description;
        public Integer fans_count;
        public Integer follow_count;
        public Double lat;
        public Integer level_exp;
        public Integer level_id;
        public Double lng;
        public String portrait;
        public Integer sex;
        public Long user_id;
        public String user_name;
        public Integer user_status;

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
        public Builder(LiveUserInfo liveUserInfo) {
            super(liveUserInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {liveUserInfo};
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
            if (liveUserInfo == null) {
                return;
            }
            this.user_id = liveUserInfo.user_id;
            this.ala_id = liveUserInfo.ala_id;
            this.user_name = liveUserInfo.user_name;
            this.sex = liveUserInfo.sex;
            this.description = liveUserInfo.description;
            this.portrait = liveUserInfo.portrait;
            this.level_id = liveUserInfo.level_id;
            this.level_exp = liveUserInfo.level_exp;
            this.lng = liveUserInfo.lng;
            this.lat = liveUserInfo.lat;
            this.fans_count = liveUserInfo.fans_count;
            this.follow_count = liveUserInfo.follow_count;
            this.charm_count = liveUserInfo.charm_count;
            this.user_status = liveUserInfo.user_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveUserInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new LiveUserInfo(this, z, null);
            }
            return (LiveUserInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(933226508, "Ltbclient/LiveUserInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(933226508, "Ltbclient/LiveUserInfo;");
                return;
            }
        }
        DEFAULT_USER_ID = 0L;
        DEFAULT_ALA_ID = 0L;
        DEFAULT_SEX = 0;
        DEFAULT_LEVEL_ID = 0;
        DEFAULT_LEVEL_EXP = 0;
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_LNG = valueOf;
        DEFAULT_LAT = valueOf;
        DEFAULT_FANS_COUNT = 0;
        DEFAULT_FOLLOW_COUNT = 0;
        DEFAULT_CHARM_COUNT = 0;
        DEFAULT_USER_STATUS = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveUserInfo(Builder builder, boolean z) {
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
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            Long l2 = builder.ala_id;
            if (l2 == null) {
                this.ala_id = DEFAULT_ALA_ID;
            } else {
                this.ala_id = l2;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Integer num = builder.sex;
            if (num == null) {
                this.sex = DEFAULT_SEX;
            } else {
                this.sex = num;
            }
            String str2 = builder.description;
            if (str2 == null) {
                this.description = "";
            } else {
                this.description = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
            } else {
                this.portrait = str3;
            }
            Integer num2 = builder.level_id;
            if (num2 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num2;
            }
            Integer num3 = builder.level_exp;
            if (num3 == null) {
                this.level_exp = DEFAULT_LEVEL_EXP;
            } else {
                this.level_exp = num3;
            }
            Double d = builder.lng;
            if (d == null) {
                this.lng = DEFAULT_LNG;
            } else {
                this.lng = d;
            }
            Double d2 = builder.lat;
            if (d2 == null) {
                this.lat = DEFAULT_LAT;
            } else {
                this.lat = d2;
            }
            Integer num4 = builder.fans_count;
            if (num4 == null) {
                this.fans_count = DEFAULT_FANS_COUNT;
            } else {
                this.fans_count = num4;
            }
            Integer num5 = builder.follow_count;
            if (num5 == null) {
                this.follow_count = DEFAULT_FOLLOW_COUNT;
            } else {
                this.follow_count = num5;
            }
            Integer num6 = builder.charm_count;
            if (num6 == null) {
                this.charm_count = DEFAULT_CHARM_COUNT;
            } else {
                this.charm_count = num6;
            }
            Integer num7 = builder.user_status;
            if (num7 == null) {
                this.user_status = DEFAULT_USER_STATUS;
                return;
            } else {
                this.user_status = num7;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.ala_id = builder.ala_id;
        this.user_name = builder.user_name;
        this.sex = builder.sex;
        this.description = builder.description;
        this.portrait = builder.portrait;
        this.level_id = builder.level_id;
        this.level_exp = builder.level_exp;
        this.lng = builder.lng;
        this.lat = builder.lat;
        this.fans_count = builder.fans_count;
        this.follow_count = builder.follow_count;
        this.charm_count = builder.charm_count;
        this.user_status = builder.user_status;
    }

    public /* synthetic */ LiveUserInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
