package tbclient.HomePage;

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
public final class TwzbThreadItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final Long DEFAULT_TID;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public String link_url;
        public String pic_url;
        public Long tid;
        public String title;

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
        public Builder(TwzbThreadItem twzbThreadItem) {
            super(twzbThreadItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {twzbThreadItem};
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
            if (twzbThreadItem == null) {
                return;
            }
            this.tid = twzbThreadItem.tid;
            this.title = twzbThreadItem.title;
            this._abstract = twzbThreadItem._abstract;
            this.pic_url = twzbThreadItem.pic_url;
            this.link_url = twzbThreadItem.link_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwzbThreadItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new TwzbThreadItem(this, z, null);
            }
            return (TwzbThreadItem) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(933323900, "Ltbclient/HomePage/TwzbThreadItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(933323900, "Ltbclient/HomePage/TwzbThreadItem;");
                return;
            }
        }
        DEFAULT_TID = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwzbThreadItem(Builder builder, boolean z) {
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
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            String str3 = builder.pic_url;
            if (str3 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str3;
            }
            String str4 = builder.link_url;
            if (str4 == null) {
                this.link_url = "";
                return;
            } else {
                this.link_url = str4;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.pic_url = builder.pic_url;
        this.link_url = builder.link_url;
    }

    public /* synthetic */ TwzbThreadItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
