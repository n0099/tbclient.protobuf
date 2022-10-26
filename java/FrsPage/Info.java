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
public final class Info extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_POST_NUM;
    public static final List<RecmForumInfo> DEFAULT_RECM_FORUM_LIST;
    public static final Integer DEFAULT_USER_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<RecmForumInfo> recm_forum_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer user_num;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer post_num;
        public List recm_forum_list;
        public Integer user_num;

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
        public Builder(Info info) {
            super(info);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {info};
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
            if (info == null) {
                return;
            }
            this.user_num = info.user_num;
            this.post_num = info.post_num;
            this.recm_forum_list = Message.copyOf(info.recm_forum_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Info build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Info(this, z, null);
            }
            return (Info) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1083532918, "Ltbclient/FrsPage/Info;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1083532918, "Ltbclient/FrsPage/Info;");
                return;
            }
        }
        DEFAULT_USER_NUM = 0;
        DEFAULT_POST_NUM = 0;
        DEFAULT_RECM_FORUM_LIST = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Info(Builder builder, boolean z) {
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
            Integer num = builder.user_num;
            if (num == null) {
                this.user_num = DEFAULT_USER_NUM;
            } else {
                this.user_num = num;
            }
            Integer num2 = builder.post_num;
            if (num2 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num2;
            }
            List list = builder.recm_forum_list;
            if (list == null) {
                this.recm_forum_list = DEFAULT_RECM_FORUM_LIST;
                return;
            } else {
                this.recm_forum_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.user_num = builder.user_num;
        this.post_num = builder.post_num;
        this.recm_forum_list = Message.immutableCopyOf(builder.recm_forum_list);
    }

    public /* synthetic */ Info(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
