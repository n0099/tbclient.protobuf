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
public final class AppPosInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_ADDR_TIMESTAMP;
    public static final Boolean DEFAULT_AP_CONNECTED;
    public static final String DEFAULT_AP_MAC = "";
    public static final String DEFAULT_ASP_SHOWN_INFO = "";
    public static final String DEFAULT_COORDINATE_TYPE = "";
    public static final String DEFAULT_LATITUDE = "";
    public static final String DEFAULT_LONGITUDE = "";
    public static final Integer DEFAULT_MERCATOR_CITY;
    public static final String DEFAULT_MERCATOR_CITY_NAME = "";
    public static final String DEFAULT_MERCATOR_DISTRICT_NAME = "";
    public static final String DEFAULT_MERCATOR_LAT = "";
    public static final String DEFAULT_MERCATOR_LON = "";
    public static final String DEFAULT_MERCATOR_PROVINCE_NAME = "";
    public static final String DEFAULT_MERCATOR_RADIUS = "";
    public static final Long DEFAULT_MERCATOR_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long addr_timestamp;
    @ProtoField(tag = 2, type = Message.Datatype.BOOL)
    public final Boolean ap_connected;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String ap_mac;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String asp_shown_info;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String coordinate_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String latitude;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String longitude;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer mercator_city;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String mercator_city_name;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String mercator_district_name;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String mercator_lat;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String mercator_lon;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String mercator_province_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String mercator_radius;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long mercator_time;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AppPosInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long addr_timestamp;
        public Boolean ap_connected;
        public String ap_mac;
        public String asp_shown_info;
        public String coordinate_type;
        public String latitude;
        public String longitude;
        public Integer mercator_city;
        public String mercator_city_name;
        public String mercator_district_name;
        public String mercator_lat;
        public String mercator_lon;
        public String mercator_province_name;
        public String mercator_radius;
        public Long mercator_time;

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
        public Builder(AppPosInfo appPosInfo) {
            super(appPosInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {appPosInfo};
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
            if (appPosInfo == null) {
                return;
            }
            this.ap_mac = appPosInfo.ap_mac;
            this.ap_connected = appPosInfo.ap_connected;
            this.coordinate_type = appPosInfo.coordinate_type;
            this.longitude = appPosInfo.longitude;
            this.latitude = appPosInfo.latitude;
            this.addr_timestamp = appPosInfo.addr_timestamp;
            this.asp_shown_info = appPosInfo.asp_shown_info;
            this.mercator_lat = appPosInfo.mercator_lat;
            this.mercator_lon = appPosInfo.mercator_lon;
            this.mercator_radius = appPosInfo.mercator_radius;
            this.mercator_time = appPosInfo.mercator_time;
            this.mercator_city = appPosInfo.mercator_city;
            this.mercator_province_name = appPosInfo.mercator_province_name;
            this.mercator_city_name = appPosInfo.mercator_city_name;
            this.mercator_district_name = appPosInfo.mercator_district_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AppPosInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AppPosInfo(this, z, null) : (AppPosInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1216077456, "Ltbclient/AppPosInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1216077456, "Ltbclient/AppPosInfo;");
                return;
            }
        }
        DEFAULT_AP_CONNECTED = Boolean.FALSE;
        DEFAULT_ADDR_TIMESTAMP = 0L;
        DEFAULT_MERCATOR_TIME = 0L;
        DEFAULT_MERCATOR_CITY = 0;
    }

    public /* synthetic */ AppPosInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppPosInfo(Builder builder, boolean z) {
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
            String str = builder.ap_mac;
            if (str == null) {
                this.ap_mac = "";
            } else {
                this.ap_mac = str;
            }
            Boolean bool = builder.ap_connected;
            if (bool == null) {
                this.ap_connected = DEFAULT_AP_CONNECTED;
            } else {
                this.ap_connected = bool;
            }
            String str2 = builder.coordinate_type;
            if (str2 == null) {
                this.coordinate_type = "";
            } else {
                this.coordinate_type = str2;
            }
            String str3 = builder.longitude;
            if (str3 == null) {
                this.longitude = "";
            } else {
                this.longitude = str3;
            }
            String str4 = builder.latitude;
            if (str4 == null) {
                this.latitude = "";
            } else {
                this.latitude = str4;
            }
            Long l = builder.addr_timestamp;
            if (l == null) {
                this.addr_timestamp = DEFAULT_ADDR_TIMESTAMP;
            } else {
                this.addr_timestamp = l;
            }
            String str5 = builder.asp_shown_info;
            if (str5 == null) {
                this.asp_shown_info = "";
            } else {
                this.asp_shown_info = str5;
            }
            String str6 = builder.mercator_lat;
            if (str6 == null) {
                this.mercator_lat = "";
            } else {
                this.mercator_lat = str6;
            }
            String str7 = builder.mercator_lon;
            if (str7 == null) {
                this.mercator_lon = "";
            } else {
                this.mercator_lon = str7;
            }
            String str8 = builder.mercator_radius;
            if (str8 == null) {
                this.mercator_radius = "";
            } else {
                this.mercator_radius = str8;
            }
            Long l2 = builder.mercator_time;
            if (l2 == null) {
                this.mercator_time = DEFAULT_MERCATOR_TIME;
            } else {
                this.mercator_time = l2;
            }
            Integer num = builder.mercator_city;
            if (num == null) {
                this.mercator_city = DEFAULT_MERCATOR_CITY;
            } else {
                this.mercator_city = num;
            }
            String str9 = builder.mercator_province_name;
            if (str9 == null) {
                this.mercator_province_name = "";
            } else {
                this.mercator_province_name = str9;
            }
            String str10 = builder.mercator_city_name;
            if (str10 == null) {
                this.mercator_city_name = "";
            } else {
                this.mercator_city_name = str10;
            }
            String str11 = builder.mercator_district_name;
            if (str11 == null) {
                this.mercator_district_name = "";
                return;
            } else {
                this.mercator_district_name = str11;
                return;
            }
        }
        this.ap_mac = builder.ap_mac;
        this.ap_connected = builder.ap_connected;
        this.coordinate_type = builder.coordinate_type;
        this.longitude = builder.longitude;
        this.latitude = builder.latitude;
        this.addr_timestamp = builder.addr_timestamp;
        this.asp_shown_info = builder.asp_shown_info;
        this.mercator_lat = builder.mercator_lat;
        this.mercator_lon = builder.mercator_lon;
        this.mercator_radius = builder.mercator_radius;
        this.mercator_time = builder.mercator_time;
        this.mercator_city = builder.mercator_city;
        this.mercator_province_name = builder.mercator_province_name;
        this.mercator_city_name = builder.mercator_city_name;
        this.mercator_district_name = builder.mercator_district_name;
    }
}
