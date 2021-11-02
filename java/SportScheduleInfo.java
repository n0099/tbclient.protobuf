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
public final class SportScheduleInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_GUEST_TEAM_ICON = "";
    public static final String DEFAULT_GUEST_TEAM_NAME = "";
    public static final String DEFAULT_HOME_TEAM_ICON = "";
    public static final String DEFAULT_HOME_TEAM_NAME = "";
    public static final String DEFAULT_MATCH_BOTTOM_INFO = "";
    public static final String DEFAULT_MATCH_MIDDLE_INFO = "";
    public static final String DEFAULT_MATCH_TOP_INFO = "";
    public static final String DEFAULT_MSG_URL = "";
    public static final Integer DEFAULT_SPORT_TYPE;
    public static final Long DEFAULT_UPDATE_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String guest_team_icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String guest_team_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String home_team_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String home_team_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String match_bottom_info;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String match_middle_info;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String match_top_info;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String msg_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer sport_type;
    @ProtoField(tag = 13, type = Message.Datatype.INT64)
    public final Long update_time;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<SportScheduleInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String guest_team_icon;
        public String guest_team_name;
        public String home_team_icon;
        public String home_team_name;
        public String match_bottom_info;
        public String match_middle_info;
        public String match_top_info;
        public String msg_url;
        public Integer sport_type;
        public Long update_time;

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
        public Builder(SportScheduleInfo sportScheduleInfo) {
            super(sportScheduleInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {sportScheduleInfo};
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
            if (sportScheduleInfo == null) {
                return;
            }
            this.sport_type = sportScheduleInfo.sport_type;
            this.home_team_name = sportScheduleInfo.home_team_name;
            this.guest_team_name = sportScheduleInfo.guest_team_name;
            this.home_team_icon = sportScheduleInfo.home_team_icon;
            this.guest_team_icon = sportScheduleInfo.guest_team_icon;
            this.match_top_info = sportScheduleInfo.match_top_info;
            this.match_middle_info = sportScheduleInfo.match_middle_info;
            this.match_bottom_info = sportScheduleInfo.match_bottom_info;
            this.msg_url = sportScheduleInfo.msg_url;
            this.update_time = sportScheduleInfo.update_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SportScheduleInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SportScheduleInfo(this, z, null) : (SportScheduleInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(3927116, "Ltbclient/SportScheduleInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(3927116, "Ltbclient/SportScheduleInfo;");
                return;
            }
        }
        DEFAULT_SPORT_TYPE = 0;
        DEFAULT_UPDATE_TIME = 0L;
    }

    public /* synthetic */ SportScheduleInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportScheduleInfo(Builder builder, boolean z) {
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
            Integer num = builder.sport_type;
            if (num == null) {
                this.sport_type = DEFAULT_SPORT_TYPE;
            } else {
                this.sport_type = num;
            }
            String str = builder.home_team_name;
            if (str == null) {
                this.home_team_name = "";
            } else {
                this.home_team_name = str;
            }
            String str2 = builder.guest_team_name;
            if (str2 == null) {
                this.guest_team_name = "";
            } else {
                this.guest_team_name = str2;
            }
            String str3 = builder.home_team_icon;
            if (str3 == null) {
                this.home_team_icon = "";
            } else {
                this.home_team_icon = str3;
            }
            String str4 = builder.guest_team_icon;
            if (str4 == null) {
                this.guest_team_icon = "";
            } else {
                this.guest_team_icon = str4;
            }
            String str5 = builder.match_top_info;
            if (str5 == null) {
                this.match_top_info = "";
            } else {
                this.match_top_info = str5;
            }
            String str6 = builder.match_middle_info;
            if (str6 == null) {
                this.match_middle_info = "";
            } else {
                this.match_middle_info = str6;
            }
            String str7 = builder.match_bottom_info;
            if (str7 == null) {
                this.match_bottom_info = "";
            } else {
                this.match_bottom_info = str7;
            }
            String str8 = builder.msg_url;
            if (str8 == null) {
                this.msg_url = "";
            } else {
                this.msg_url = str8;
            }
            Long l = builder.update_time;
            if (l == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
                return;
            } else {
                this.update_time = l;
                return;
            }
        }
        this.sport_type = builder.sport_type;
        this.home_team_name = builder.home_team_name;
        this.guest_team_name = builder.guest_team_name;
        this.home_team_icon = builder.home_team_icon;
        this.guest_team_icon = builder.guest_team_icon;
        this.match_top_info = builder.match_top_info;
        this.match_middle_info = builder.match_middle_info;
        this.match_bottom_info = builder.match_bottom_info;
        this.msg_url = builder.msg_url;
        this.update_time = builder.update_time;
    }
}
