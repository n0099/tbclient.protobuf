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
/* loaded from: classes8.dex */
public final class Adkiller extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_AD_LEFT_NUM;
    public static final List<AdkillerAd> DEFAULT_AD_LIST;
    public static final String DEFAULT_HINT_URL = "";
    public static final Integer DEFAULT_SHOW_AD;
    public static final Integer DEFAULT_SHOW_HINT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer ad_left_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<AdkillerAd> ad_list;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String hint_url;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer show_ad;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer show_hint;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<Adkiller> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer ad_left_num;
        public List<AdkillerAd> ad_list;
        public String hint_url;
        public Integer show_ad;
        public Integer show_hint;

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
        public Builder(Adkiller adkiller) {
            super(adkiller);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {adkiller};
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
            if (adkiller == null) {
                return;
            }
            this.show_hint = adkiller.show_hint;
            this.show_ad = adkiller.show_ad;
            this.hint_url = adkiller.hint_url;
            this.ad_left_num = adkiller.ad_left_num;
            this.ad_list = Message.copyOf(adkiller.ad_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Adkiller build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Adkiller(this, z, null) : (Adkiller) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1102659254, "Ltbclient/FrsPage/Adkiller;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1102659254, "Ltbclient/FrsPage/Adkiller;");
                return;
            }
        }
        DEFAULT_SHOW_HINT = 0;
        DEFAULT_SHOW_AD = 0;
        DEFAULT_AD_LEFT_NUM = 0;
        DEFAULT_AD_LIST = Collections.emptyList();
    }

    public /* synthetic */ Adkiller(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Adkiller(Builder builder, boolean z) {
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
            Integer num = builder.show_hint;
            if (num == null) {
                this.show_hint = DEFAULT_SHOW_HINT;
            } else {
                this.show_hint = num;
            }
            Integer num2 = builder.show_ad;
            if (num2 == null) {
                this.show_ad = DEFAULT_SHOW_AD;
            } else {
                this.show_ad = num2;
            }
            String str = builder.hint_url;
            if (str == null) {
                this.hint_url = "";
            } else {
                this.hint_url = str;
            }
            Integer num3 = builder.ad_left_num;
            if (num3 == null) {
                this.ad_left_num = DEFAULT_AD_LEFT_NUM;
            } else {
                this.ad_left_num = num3;
            }
            List<AdkillerAd> list = builder.ad_list;
            if (list == null) {
                this.ad_list = DEFAULT_AD_LIST;
                return;
            } else {
                this.ad_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.show_hint = builder.show_hint;
        this.show_ad = builder.show_ad;
        this.hint_url = builder.hint_url;
        this.ad_left_num = builder.ad_left_num;
        this.ad_list = Message.immutableCopyOf(builder.ad_list);
    }
}
