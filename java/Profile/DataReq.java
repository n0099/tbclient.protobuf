package tbclient.Profile;

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
/* loaded from: classes5.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_FRIEND_UID;
    public static final String DEFAULT_FRIEND_UID_PORTRAIT = "";
    public static final Integer DEFAULT_HAS_PLIST;
    public static final Integer DEFAULT_IS_FROM_USERCENTER;
    public static final Integer DEFAULT_IS_GUEST;
    public static final Integer DEFAULT_NEED_POST_COUNT;
    public static final Integer DEFAULT_PAGE;
    public static final Integer DEFAULT_PN;
    public static final Integer DEFAULT_Q_TYPE;
    public static final Integer DEFAULT_RN;
    public static final Double DEFAULT_SCR_DIP;
    public static final Integer DEFAULT_SCR_H;
    public static final Integer DEFAULT_SCR_W;
    public static final String DEFAULT_ST_TYPE = "";
    public static final Long DEFAULT_UID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 9)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f62879common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long friend_uid;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String friend_uid_portrait;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer has_plist;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer is_from_usercenter;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_guest;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer need_post_count;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer page;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer q_type;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer rn;
    @ProtoField(tag = 13, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long uid;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f62880common;
        public Long friend_uid;
        public String friend_uid_portrait;
        public Integer has_plist;
        public Integer is_from_usercenter;
        public Integer is_guest;
        public Integer need_post_count;
        public Integer page;
        public Integer pn;
        public Integer q_type;
        public Integer rn;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String st_type;
        public Long uid;

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
            this.uid = dataReq.uid;
            this.need_post_count = dataReq.need_post_count;
            this.friend_uid = dataReq.friend_uid;
            this.is_guest = dataReq.is_guest;
            this.st_type = dataReq.st_type;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.has_plist = dataReq.has_plist;
            this.f62880common = dataReq.f62879common;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.q_type = dataReq.q_type;
            this.scr_dip = dataReq.scr_dip;
            this.is_from_usercenter = dataReq.is_from_usercenter;
            this.page = dataReq.page;
            this.friend_uid_portrait = dataReq.friend_uid_portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1548228393, "Ltbclient/Profile/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1548228393, "Ltbclient/Profile/DataReq;");
                return;
            }
        }
        DEFAULT_UID = 0L;
        DEFAULT_NEED_POST_COUNT = 0;
        DEFAULT_FRIEND_UID = 0L;
        DEFAULT_IS_GUEST = 0;
        DEFAULT_PN = 0;
        DEFAULT_RN = 0;
        DEFAULT_HAS_PLIST = 0;
        DEFAULT_SCR_W = 0;
        DEFAULT_SCR_H = 0;
        DEFAULT_Q_TYPE = 0;
        DEFAULT_SCR_DIP = Double.valueOf(0.0d);
        DEFAULT_IS_FROM_USERCENTER = 0;
        DEFAULT_PAGE = 0;
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
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            Integer num = builder.need_post_count;
            if (num == null) {
                this.need_post_count = DEFAULT_NEED_POST_COUNT;
            } else {
                this.need_post_count = num;
            }
            Long l2 = builder.friend_uid;
            if (l2 == null) {
                this.friend_uid = DEFAULT_FRIEND_UID;
            } else {
                this.friend_uid = l2;
            }
            Integer num2 = builder.is_guest;
            if (num2 == null) {
                this.is_guest = DEFAULT_IS_GUEST;
            } else {
                this.is_guest = num2;
            }
            String str = builder.st_type;
            if (str == null) {
                this.st_type = "";
            } else {
                this.st_type = str;
            }
            Integer num3 = builder.pn;
            if (num3 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num3;
            }
            Integer num4 = builder.rn;
            if (num4 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num4;
            }
            Integer num5 = builder.has_plist;
            if (num5 == null) {
                this.has_plist = DEFAULT_HAS_PLIST;
            } else {
                this.has_plist = num5;
            }
            this.f62879common = builder.f62880common;
            Integer num6 = builder.scr_w;
            if (num6 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num6;
            }
            Integer num7 = builder.scr_h;
            if (num7 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num7;
            }
            Integer num8 = builder.q_type;
            if (num8 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num8;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            Integer num9 = builder.is_from_usercenter;
            if (num9 == null) {
                this.is_from_usercenter = DEFAULT_IS_FROM_USERCENTER;
            } else {
                this.is_from_usercenter = num9;
            }
            Integer num10 = builder.page;
            if (num10 == null) {
                this.page = DEFAULT_PAGE;
            } else {
                this.page = num10;
            }
            String str2 = builder.friend_uid_portrait;
            if (str2 == null) {
                this.friend_uid_portrait = "";
                return;
            } else {
                this.friend_uid_portrait = str2;
                return;
            }
        }
        this.uid = builder.uid;
        this.need_post_count = builder.need_post_count;
        this.friend_uid = builder.friend_uid;
        this.is_guest = builder.is_guest;
        this.st_type = builder.st_type;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.has_plist = builder.has_plist;
        this.f62879common = builder.f62880common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
        this.is_from_usercenter = builder.is_from_usercenter;
        this.page = builder.page;
        this.friend_uid_portrait = builder.friend_uid_portrait;
    }
}
