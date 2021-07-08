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
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class NtSpreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_LINK_URL = "";
    public static final List<String> DEFAULT_PICS;
    public static final Integer DEFAULT_POSITION;
    public static final String DEFAULT_PUBLISH_DATE = "";
    public static final String DEFAULT_TIPS = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TYPE = "";
    public static final String DEFAULT_USER_AVATAR = "";
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
    public final List<String> pics;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer position;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String publish_date;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tips;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_avatar;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NtSpreadInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String link_url;
        public List<String> pics;
        public Integer position;
        public String publish_date;
        public String tips;
        public String title;
        public String type;
        public String user_avatar;
        public String user_name;

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
        public Builder(NtSpreadInfo ntSpreadInfo) {
            super(ntSpreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {ntSpreadInfo};
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
            if (ntSpreadInfo == null) {
                return;
            }
            this.user_name = ntSpreadInfo.user_name;
            this.user_avatar = ntSpreadInfo.user_avatar;
            this.tips = ntSpreadInfo.tips;
            this.type = ntSpreadInfo.type;
            this.title = ntSpreadInfo.title;
            this.pics = Message.copyOf(ntSpreadInfo.pics);
            this.link_url = ntSpreadInfo.link_url;
            this.position = ntSpreadInfo.position;
            this.publish_date = ntSpreadInfo.publish_date;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NtSpreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new NtSpreadInfo(this, z, null) : (NtSpreadInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-682459855, "Ltbclient/FrsPage/NtSpreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-682459855, "Ltbclient/FrsPage/NtSpreadInfo;");
                return;
            }
        }
        DEFAULT_PICS = Collections.emptyList();
        DEFAULT_POSITION = 0;
    }

    public /* synthetic */ NtSpreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NtSpreadInfo(Builder builder, boolean z) {
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
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.user_avatar;
            if (str2 == null) {
                this.user_avatar = "";
            } else {
                this.user_avatar = str2;
            }
            String str3 = builder.tips;
            if (str3 == null) {
                this.tips = "";
            } else {
                this.tips = str3;
            }
            String str4 = builder.type;
            if (str4 == null) {
                this.type = "";
            } else {
                this.type = str4;
            }
            String str5 = builder.title;
            if (str5 == null) {
                this.title = "";
            } else {
                this.title = str5;
            }
            List<String> list = builder.pics;
            if (list == null) {
                this.pics = DEFAULT_PICS;
            } else {
                this.pics = Message.immutableCopyOf(list);
            }
            String str6 = builder.link_url;
            if (str6 == null) {
                this.link_url = "";
            } else {
                this.link_url = str6;
            }
            Integer num = builder.position;
            if (num == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = num;
            }
            String str7 = builder.publish_date;
            if (str7 == null) {
                this.publish_date = "";
                return;
            } else {
                this.publish_date = str7;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.user_avatar = builder.user_avatar;
        this.tips = builder.tips;
        this.type = builder.type;
        this.title = builder.title;
        this.pics = Message.immutableCopyOf(builder.pics);
        this.link_url = builder.link_url;
        this.position = builder.position;
        this.publish_date = builder.publish_date;
    }
}
