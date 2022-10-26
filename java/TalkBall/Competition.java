package tbclient.TalkBall;

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
public final class Competition extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BTN_TITLE = "";
    public static final List<Country> DEFAULT_COUNTRY;
    public static final Long DEFAULT_TIME;
    public static final String DEFAULT_TYPE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String btn_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Country> country;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String type;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String btn_title;
        public List country;
        public Long time;
        public String type;

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
        public Builder(Competition competition) {
            super(competition);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {competition};
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
            if (competition == null) {
                return;
            }
            this.country = Message.copyOf(competition.country);
            this.time = competition.time;
            this.type = competition.type;
            this.btn_title = competition.btn_title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Competition build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Competition(this, z, null);
            }
            return (Competition) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1530991254, "Ltbclient/TalkBall/Competition;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1530991254, "Ltbclient/TalkBall/Competition;");
                return;
            }
        }
        DEFAULT_COUNTRY = Collections.emptyList();
        DEFAULT_TIME = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Competition(Builder builder, boolean z) {
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
            List list = builder.country;
            if (list == null) {
                this.country = DEFAULT_COUNTRY;
            } else {
                this.country = Message.immutableCopyOf(list);
            }
            Long l = builder.time;
            if (l == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = l;
            }
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.btn_title;
            if (str2 == null) {
                this.btn_title = "";
                return;
            } else {
                this.btn_title = str2;
                return;
            }
        }
        this.country = Message.immutableCopyOf(builder.country);
        this.time = builder.time;
        this.type = builder.type;
        this.btn_title = builder.btn_title;
    }

    public /* synthetic */ Competition(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
