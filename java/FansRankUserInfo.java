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
public final class FansRankUserInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_PRESENT_NUM;
    public static final String DEFAULT_PRESENT_SCORES = "";
    public static final Integer DEFAULT_USER_ID;
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer present_num;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String present_scores;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FansRankUserInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String portrait;
        public Integer present_num;
        public String present_scores;
        public Integer user_id;
        public String user_name;

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
        public Builder(FansRankUserInfo fansRankUserInfo) {
            super(fansRankUserInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {fansRankUserInfo};
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
            if (fansRankUserInfo == null) {
                return;
            }
            this.user_id = fansRankUserInfo.user_id;
            this.user_name = fansRankUserInfo.user_name;
            this.present_num = fansRankUserInfo.present_num;
            this.present_scores = fansRankUserInfo.present_scores;
            this.portrait = fansRankUserInfo.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FansRankUserInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FansRankUserInfo(this, z, null) : (FansRankUserInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1264694804, "Ltbclient/FansRankUserInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1264694804, "Ltbclient/FansRankUserInfo;");
                return;
            }
        }
        DEFAULT_USER_ID = 0;
        DEFAULT_PRESENT_NUM = 0;
    }

    public /* synthetic */ FansRankUserInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FansRankUserInfo(Builder builder, boolean z) {
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
            Integer num = builder.user_id;
            if (num == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = num;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Integer num2 = builder.present_num;
            if (num2 == null) {
                this.present_num = DEFAULT_PRESENT_NUM;
            } else {
                this.present_num = num2;
            }
            String str2 = builder.present_scores;
            if (str2 == null) {
                this.present_scores = "";
            } else {
                this.present_scores = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str3;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.present_num = builder.present_num;
        this.present_scores = builder.present_scores;
        this.portrait = builder.portrait;
    }
}
