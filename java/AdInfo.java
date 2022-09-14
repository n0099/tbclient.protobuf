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
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class AdInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AD_DESC = "";
    public static final String DEFAULT_AD_NAME = "";
    public static final String DEFAULT_AD_PIC = "";
    public static final Integer DEFAULT_AD_TYPE;
    public static final String DEFAULT_AD_URL = "";
    public static final List<Media> DEFAULT_MEDIA;
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_SHOW_RULE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ad_desc;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ad_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ad_pic;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer ad_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ad_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<Media> media;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer show_rule;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AdInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String ad_desc;
        public String ad_name;
        public String ad_pic;
        public Integer ad_type;
        public String ad_url;
        public List<Media> media;
        public String portrait;
        public Integer show_rule;

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
        public Builder(AdInfo adInfo) {
            super(adInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {adInfo};
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
            if (adInfo == null) {
                return;
            }
            this.show_rule = adInfo.show_rule;
            this.ad_type = adInfo.ad_type;
            this.ad_desc = adInfo.ad_desc;
            this.ad_pic = adInfo.ad_pic;
            this.ad_url = adInfo.ad_url;
            this.ad_name = adInfo.ad_name;
            this.portrait = adInfo.portrait;
            this.media = Message.copyOf(adInfo.media);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AdInfo(this, z, null) : (AdInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1025360192, "Ltbclient/AdInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1025360192, "Ltbclient/AdInfo;");
                return;
            }
        }
        DEFAULT_SHOW_RULE = 0;
        DEFAULT_AD_TYPE = 0;
        DEFAULT_MEDIA = Collections.emptyList();
    }

    public /* synthetic */ AdInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdInfo(Builder builder, boolean z) {
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
            Integer num = builder.show_rule;
            if (num == null) {
                this.show_rule = DEFAULT_SHOW_RULE;
            } else {
                this.show_rule = num;
            }
            Integer num2 = builder.ad_type;
            if (num2 == null) {
                this.ad_type = DEFAULT_AD_TYPE;
            } else {
                this.ad_type = num2;
            }
            String str = builder.ad_desc;
            if (str == null) {
                this.ad_desc = "";
            } else {
                this.ad_desc = str;
            }
            String str2 = builder.ad_pic;
            if (str2 == null) {
                this.ad_pic = "";
            } else {
                this.ad_pic = str2;
            }
            String str3 = builder.ad_url;
            if (str3 == null) {
                this.ad_url = "";
            } else {
                this.ad_url = str3;
            }
            String str4 = builder.ad_name;
            if (str4 == null) {
                this.ad_name = "";
            } else {
                this.ad_name = str4;
            }
            String str5 = builder.portrait;
            if (str5 == null) {
                this.portrait = "";
            } else {
                this.portrait = str5;
            }
            List<Media> list = builder.media;
            if (list == null) {
                this.media = DEFAULT_MEDIA;
                return;
            } else {
                this.media = Message.immutableCopyOf(list);
                return;
            }
        }
        this.show_rule = builder.show_rule;
        this.ad_type = builder.ad_type;
        this.ad_desc = builder.ad_desc;
        this.ad_pic = builder.ad_pic;
        this.ad_url = builder.ad_url;
        this.ad_name = builder.ad_name;
        this.portrait = builder.portrait;
        this.media = Message.immutableCopyOf(builder.media);
    }
}
