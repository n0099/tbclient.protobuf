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
/* loaded from: classes4.dex */
public final class High extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_ALBUM_ID;
    public static final Integer DEFAULT_CREATE_TIME;
    public static final Long DEFAULT_HID;
    public static final Integer DEFAULT_NUM_CAI;
    public static final Integer DEFAULT_NUM_ZAN;
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_TYPE;
    public static final Long DEFAULT_UID;
    public static final String DEFAULT_USER_NAME = "";
    public static final Integer DEFAULT_WEIGHT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long album_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long hid;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer num_cai;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer num_zan;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long uid;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer weight;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<High> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long album_id;
        public Integer create_time;
        public Long hid;
        public Integer num_cai;
        public Integer num_zan;
        public String pic_url;
        public String portrait;
        public Integer type;
        public Long uid;
        public String user_name;
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
        public Builder(High high) {
            super(high);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {high};
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
            if (high == null) {
                return;
            }
            this.album_id = high.album_id;
            this.hid = high.hid;
            this.uid = high.uid;
            this.pic_url = high.pic_url;
            this.create_time = high.create_time;
            this.num_zan = high.num_zan;
            this.num_cai = high.num_cai;
            this.weight = high.weight;
            this.type = high.type;
            this.portrait = high.portrait;
            this.user_name = high.user_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public High build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new High(this, z, null) : (High) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1098334161, "Ltbclient/High;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1098334161, "Ltbclient/High;");
                return;
            }
        }
        DEFAULT_ALBUM_ID = 0L;
        DEFAULT_HID = 0L;
        DEFAULT_UID = 0L;
        DEFAULT_CREATE_TIME = 0;
        DEFAULT_NUM_ZAN = 0;
        DEFAULT_NUM_CAI = 0;
        DEFAULT_WEIGHT = 0;
        DEFAULT_TYPE = 0;
    }

    public /* synthetic */ High(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public High(Builder builder, boolean z) {
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
            Long l = builder.album_id;
            if (l == null) {
                this.album_id = DEFAULT_ALBUM_ID;
            } else {
                this.album_id = l;
            }
            Long l2 = builder.hid;
            if (l2 == null) {
                this.hid = DEFAULT_HID;
            } else {
                this.hid = l2;
            }
            Long l3 = builder.uid;
            if (l3 == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l3;
            }
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str;
            }
            Integer num = builder.create_time;
            if (num == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num;
            }
            Integer num2 = builder.num_zan;
            if (num2 == null) {
                this.num_zan = DEFAULT_NUM_ZAN;
            } else {
                this.num_zan = num2;
            }
            Integer num3 = builder.num_cai;
            if (num3 == null) {
                this.num_cai = DEFAULT_NUM_CAI;
            } else {
                this.num_cai = num3;
            }
            Integer num4 = builder.weight;
            if (num4 == null) {
                this.weight = DEFAULT_WEIGHT;
            } else {
                this.weight = num4;
            }
            Integer num5 = builder.type;
            if (num5 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num5;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            String str3 = builder.user_name;
            if (str3 == null) {
                this.user_name = "";
                return;
            } else {
                this.user_name = str3;
                return;
            }
        }
        this.album_id = builder.album_id;
        this.hid = builder.hid;
        this.uid = builder.uid;
        this.pic_url = builder.pic_url;
        this.create_time = builder.create_time;
        this.num_zan = builder.num_zan;
        this.num_cai = builder.num_cai;
        this.weight = builder.weight;
        this.type = builder.type;
        this.portrait = builder.portrait;
        this.user_name = builder.user_name;
    }
}
