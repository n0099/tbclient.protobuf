package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ReplyExp extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_COLOR_MSG = "";
    public static final String DEFAULT_CURRENT_LEVEL = "";
    public static final String DEFAULT_CURRENT_LEVEL_MAX_EXP = "";
    public static final String DEFAULT_INC = "";
    public static final String DEFAULT_OLD = "";
    public static final String DEFAULT_PRE_MSG = "";
    public static final String DEFAULT_QUESTION_EXP = "";
    public static final String DEFAULT_QUESTION_MSG = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String color_msg;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String current_level;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String current_level_max_exp;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String inc;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String old;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pre_msg;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String question_exp;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String question_msg;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ReplyExp> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String color_msg;
        public String current_level;
        public String current_level_max_exp;
        public String inc;
        public String old;
        public String pre_msg;
        public String question_exp;
        public String question_msg;

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
        public Builder(ReplyExp replyExp) {
            super(replyExp);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {replyExp};
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
            if (replyExp == null) {
                return;
            }
            this.pre_msg = replyExp.pre_msg;
            this.color_msg = replyExp.color_msg;
            this.current_level_max_exp = replyExp.current_level_max_exp;
            this.current_level = replyExp.current_level;
            this.old = replyExp.old;
            this.inc = replyExp.inc;
            this.question_msg = replyExp.question_msg;
            this.question_exp = replyExp.question_exp;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReplyExp build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ReplyExp(this, z, null);
            }
            return (ReplyExp) invokeZ.objValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplyExp(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.pre_msg;
            if (str == null) {
                this.pre_msg = "";
            } else {
                this.pre_msg = str;
            }
            String str2 = builder.color_msg;
            if (str2 == null) {
                this.color_msg = "";
            } else {
                this.color_msg = str2;
            }
            String str3 = builder.current_level_max_exp;
            if (str3 == null) {
                this.current_level_max_exp = "";
            } else {
                this.current_level_max_exp = str3;
            }
            String str4 = builder.current_level;
            if (str4 == null) {
                this.current_level = "";
            } else {
                this.current_level = str4;
            }
            String str5 = builder.old;
            if (str5 == null) {
                this.old = "";
            } else {
                this.old = str5;
            }
            String str6 = builder.inc;
            if (str6 == null) {
                this.inc = "";
            } else {
                this.inc = str6;
            }
            String str7 = builder.question_msg;
            if (str7 == null) {
                this.question_msg = "";
            } else {
                this.question_msg = str7;
            }
            String str8 = builder.question_exp;
            if (str8 == null) {
                this.question_exp = "";
                return;
            } else {
                this.question_exp = str8;
                return;
            }
        }
        this.pre_msg = builder.pre_msg;
        this.color_msg = builder.color_msg;
        this.current_level_max_exp = builder.current_level_max_exp;
        this.current_level = builder.current_level;
        this.old = builder.old;
        this.inc = builder.inc;
        this.question_msg = builder.question_msg;
        this.question_exp = builder.question_exp;
    }

    public /* synthetic */ ReplyExp(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
