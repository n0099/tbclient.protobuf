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
public final class PsInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_GAME_ID;
    public static final String DEFAULT_GAME_INTRO = "";
    public static final String DEFAULT_GAME_PIC_URL = "";
    public static final Long DEFAULT_GAME_TYPE;
    public static final Long DEFAULT_SCORE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long game_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String game_intro;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String game_pic_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long game_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long score;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PsInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long game_id;
        public String game_intro;
        public String game_pic_url;
        public Long game_type;
        public Long score;

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
        public Builder(PsInfo psInfo) {
            super(psInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {psInfo};
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
            if (psInfo == null) {
                return;
            }
            this.game_id = psInfo.game_id;
            this.score = psInfo.score;
            this.game_type = psInfo.game_type;
            this.game_pic_url = psInfo.game_pic_url;
            this.game_intro = psInfo.game_intro;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PsInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PsInfo(this, z, null) : (PsInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-168269600, "Ltbclient/PsInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-168269600, "Ltbclient/PsInfo;");
                return;
            }
        }
        DEFAULT_GAME_ID = 0L;
        DEFAULT_SCORE = 0L;
        DEFAULT_GAME_TYPE = 0L;
    }

    public /* synthetic */ PsInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PsInfo(Builder builder, boolean z) {
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
            Long l = builder.game_id;
            if (l == null) {
                this.game_id = DEFAULT_GAME_ID;
            } else {
                this.game_id = l;
            }
            Long l2 = builder.score;
            if (l2 == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = l2;
            }
            Long l3 = builder.game_type;
            if (l3 == null) {
                this.game_type = DEFAULT_GAME_TYPE;
            } else {
                this.game_type = l3;
            }
            String str = builder.game_pic_url;
            if (str == null) {
                this.game_pic_url = "";
            } else {
                this.game_pic_url = str;
            }
            String str2 = builder.game_intro;
            if (str2 == null) {
                this.game_intro = "";
                return;
            } else {
                this.game_intro = str2;
                return;
            }
        }
        this.game_id = builder.game_id;
        this.score = builder.score;
        this.game_type = builder.game_type;
        this.game_pic_url = builder.game_pic_url;
        this.game_intro = builder.game_intro;
    }
}
