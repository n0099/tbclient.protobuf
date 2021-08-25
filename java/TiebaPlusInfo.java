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
/* loaded from: classes2.dex */
public final class TiebaPlusInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_APP_COMPANY = "";
    public static final String DEFAULT_APP_ICON = "";
    public static final String DEFAULT_APP_ID = "";
    public static final String DEFAULT_APP_PACKAGE = "";
    public static final String DEFAULT_APP_POWER = "";
    public static final String DEFAULT_APP_PRIVACY = "";
    public static final String DEFAULT_APP_VERSION = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DOWNLOAD_URL = "";
    public static final Integer DEFAULT_H5_JUMP_TYPE;
    public static final String DEFAULT_JUMP_URL = "";
    public static final Integer DEFAULT_TARGET_TYPE;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String app_company;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String app_icon;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String app_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String app_package;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String app_power;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String app_privacy;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String app_version;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String download_url;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer h5_jump_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer target_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TiebaPlusInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String app_company;
        public String app_icon;
        public String app_id;
        public String app_package;
        public String app_power;
        public String app_privacy;
        public String app_version;
        public String desc;
        public String download_url;
        public Integer h5_jump_type;
        public String jump_url;
        public Integer target_type;
        public String title;

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
        public Builder(TiebaPlusInfo tiebaPlusInfo) {
            super(tiebaPlusInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tiebaPlusInfo};
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
            if (tiebaPlusInfo == null) {
                return;
            }
            this.title = tiebaPlusInfo.title;
            this.desc = tiebaPlusInfo.desc;
            this.jump_url = tiebaPlusInfo.jump_url;
            this.download_url = tiebaPlusInfo.download_url;
            this.app_id = tiebaPlusInfo.app_id;
            this.app_icon = tiebaPlusInfo.app_icon;
            this.app_package = tiebaPlusInfo.app_package;
            this.app_version = tiebaPlusInfo.app_version;
            this.app_privacy = tiebaPlusInfo.app_privacy;
            this.app_power = tiebaPlusInfo.app_power;
            this.app_company = tiebaPlusInfo.app_company;
            this.target_type = tiebaPlusInfo.target_type;
            this.h5_jump_type = tiebaPlusInfo.h5_jump_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TiebaPlusInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TiebaPlusInfo(this, z, null) : (TiebaPlusInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1936198446, "Ltbclient/TiebaPlusInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1936198446, "Ltbclient/TiebaPlusInfo;");
                return;
            }
        }
        DEFAULT_TARGET_TYPE = 0;
        DEFAULT_H5_JUMP_TYPE = 0;
    }

    public /* synthetic */ TiebaPlusInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TiebaPlusInfo(Builder builder, boolean z) {
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
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
            } else {
                this.desc = str2;
            }
            String str3 = builder.jump_url;
            if (str3 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str3;
            }
            String str4 = builder.download_url;
            if (str4 == null) {
                this.download_url = "";
            } else {
                this.download_url = str4;
            }
            String str5 = builder.app_id;
            if (str5 == null) {
                this.app_id = "";
            } else {
                this.app_id = str5;
            }
            String str6 = builder.app_icon;
            if (str6 == null) {
                this.app_icon = "";
            } else {
                this.app_icon = str6;
            }
            String str7 = builder.app_package;
            if (str7 == null) {
                this.app_package = "";
            } else {
                this.app_package = str7;
            }
            String str8 = builder.app_version;
            if (str8 == null) {
                this.app_version = "";
            } else {
                this.app_version = str8;
            }
            String str9 = builder.app_privacy;
            if (str9 == null) {
                this.app_privacy = "";
            } else {
                this.app_privacy = str9;
            }
            String str10 = builder.app_power;
            if (str10 == null) {
                this.app_power = "";
            } else {
                this.app_power = str10;
            }
            String str11 = builder.app_company;
            if (str11 == null) {
                this.app_company = "";
            } else {
                this.app_company = str11;
            }
            Integer num = builder.target_type;
            if (num == null) {
                this.target_type = DEFAULT_TARGET_TYPE;
            } else {
                this.target_type = num;
            }
            Integer num2 = builder.h5_jump_type;
            if (num2 == null) {
                this.h5_jump_type = DEFAULT_H5_JUMP_TYPE;
                return;
            } else {
                this.h5_jump_type = num2;
                return;
            }
        }
        this.title = builder.title;
        this.desc = builder.desc;
        this.jump_url = builder.jump_url;
        this.download_url = builder.download_url;
        this.app_id = builder.app_id;
        this.app_icon = builder.app_icon;
        this.app_package = builder.app_package;
        this.app_version = builder.app_version;
        this.app_privacy = builder.app_privacy;
        this.app_power = builder.app_power;
        this.app_company = builder.app_company;
        this.target_type = builder.target_type;
        this.h5_jump_type = builder.h5_jump_type;
    }
}