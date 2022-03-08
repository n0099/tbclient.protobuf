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
/* loaded from: classes9.dex */
public final class ForumMember extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CUR_SCORE;
    public static final Integer DEFAULT_IS_LIKE;
    public static final Integer DEFAULT_LEVELUP_SCORE;
    public static final String DEFAULT_LEVEL_NAME = "";
    public static final Integer DEFAULT_USER_LEVEL;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer cur_score;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_like;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String level_name;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer levelup_score;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer user_level;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumMember> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer cur_score;
        public Integer is_like;
        public String level_name;
        public Integer levelup_score;
        public Integer user_level;

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
        public Builder(ForumMember forumMember) {
            super(forumMember);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumMember};
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
            if (forumMember == null) {
                return;
            }
            this.is_like = forumMember.is_like;
            this.user_level = forumMember.user_level;
            this.level_name = forumMember.level_name;
            this.cur_score = forumMember.cur_score;
            this.levelup_score = forumMember.levelup_score;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumMember build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ForumMember(this, z, null) : (ForumMember) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1496119702, "Ltbclient/ForumMember;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1496119702, "Ltbclient/ForumMember;");
                return;
            }
        }
        DEFAULT_IS_LIKE = 0;
        DEFAULT_USER_LEVEL = 0;
        DEFAULT_CUR_SCORE = 0;
        DEFAULT_LEVELUP_SCORE = 0;
    }

    public /* synthetic */ ForumMember(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumMember(Builder builder, boolean z) {
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
            Integer num = builder.is_like;
            if (num == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num;
            }
            Integer num2 = builder.user_level;
            if (num2 == null) {
                this.user_level = DEFAULT_USER_LEVEL;
            } else {
                this.user_level = num2;
            }
            String str = builder.level_name;
            if (str == null) {
                this.level_name = "";
            } else {
                this.level_name = str;
            }
            Integer num3 = builder.cur_score;
            if (num3 == null) {
                this.cur_score = DEFAULT_CUR_SCORE;
            } else {
                this.cur_score = num3;
            }
            Integer num4 = builder.levelup_score;
            if (num4 == null) {
                this.levelup_score = DEFAULT_LEVELUP_SCORE;
                return;
            } else {
                this.levelup_score = num4;
                return;
            }
        }
        this.is_like = builder.is_like;
        this.user_level = builder.user_level;
        this.level_name = builder.level_name;
        this.cur_score = builder.cur_score;
        this.levelup_score = builder.levelup_score;
    }
}
