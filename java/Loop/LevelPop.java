package tbclient.Loop;

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
public final class LevelPop extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BTN_SCHEME = "";
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_CANCEL_BTN_TEXT = "";
    public static final String DEFAULT_DESC = "";
    public static final Integer DEFAULT_LEVEL;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String btn_scheme;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String cancel_btn_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer level;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
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
        public String btn_scheme;
        public String btn_text;
        public String cancel_btn_text;
        public String desc;
        public Integer level;
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
        public Builder(LevelPop levelPop) {
            super(levelPop);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {levelPop};
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
            if (levelPop == null) {
                return;
            }
            this.title = levelPop.title;
            this.desc = levelPop.desc;
            this.btn_text = levelPop.btn_text;
            this.btn_scheme = levelPop.btn_scheme;
            this.level = levelPop.level;
            this.cancel_btn_text = levelPop.cancel_btn_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LevelPop build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new LevelPop(this, z, null);
            }
            return (LevelPop) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1387386035, "Ltbclient/Loop/LevelPop;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1387386035, "Ltbclient/Loop/LevelPop;");
                return;
            }
        }
        DEFAULT_LEVEL = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPop(Builder builder, boolean z) {
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
            String str3 = builder.btn_text;
            if (str3 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str3;
            }
            String str4 = builder.btn_scheme;
            if (str4 == null) {
                this.btn_scheme = "";
            } else {
                this.btn_scheme = str4;
            }
            Integer num = builder.level;
            if (num == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = num;
            }
            String str5 = builder.cancel_btn_text;
            if (str5 == null) {
                this.cancel_btn_text = "";
                return;
            } else {
                this.cancel_btn_text = str5;
                return;
            }
        }
        this.title = builder.title;
        this.desc = builder.desc;
        this.btn_text = builder.btn_text;
        this.btn_scheme = builder.btn_scheme;
        this.level = builder.level;
        this.cancel_btn_text = builder.cancel_btn_text;
    }

    public /* synthetic */ LevelPop(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
