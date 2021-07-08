package tbclient.ElectionInfo;

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
public final class Basic extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BEGIN_APPLY_TIME = "";
    public static final String DEFAULT_BEGIN_PUBLIC_TIME = "";
    public static final String DEFAULT_BEGIN_VOTE_TIME = "";
    public static final Integer DEFAULT_CANDIDATE_NUM;
    public static final Boolean DEFAULT_IS_VOTED;
    public static final String DEFAULT_REMIND_TIME = "";
    public static final Integer DEFAULT_STATUS;
    public static final Integer DEFAULT_TOTAL_VOTE_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String begin_apply_time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String begin_public_time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String begin_vote_time;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer candidate_num;
    @ProtoField(tag = 8, type = Message.Datatype.BOOL)
    public final Boolean is_voted;
    @ProtoField(tag = 9)
    public final NoticeContent notice;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String remind_time;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer total_vote_num;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Basic> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String begin_apply_time;
        public String begin_public_time;
        public String begin_vote_time;
        public Integer candidate_num;
        public Boolean is_voted;
        public NoticeContent notice;
        public String remind_time;
        public Integer status;
        public Integer total_vote_num;

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
        public Builder(Basic basic) {
            super(basic);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {basic};
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
            if (basic == null) {
                return;
            }
            this.begin_apply_time = basic.begin_apply_time;
            this.begin_vote_time = basic.begin_vote_time;
            this.begin_public_time = basic.begin_public_time;
            this.status = basic.status;
            this.remind_time = basic.remind_time;
            this.candidate_num = basic.candidate_num;
            this.total_vote_num = basic.total_vote_num;
            this.is_voted = basic.is_voted;
            this.notice = basic.notice;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Basic build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Basic(this, z, null) : (Basic) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1323323541, "Ltbclient/ElectionInfo/Basic;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1323323541, "Ltbclient/ElectionInfo/Basic;");
                return;
            }
        }
        DEFAULT_STATUS = 0;
        DEFAULT_CANDIDATE_NUM = 0;
        DEFAULT_TOTAL_VOTE_NUM = 0;
        DEFAULT_IS_VOTED = Boolean.FALSE;
    }

    public /* synthetic */ Basic(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Basic(Builder builder, boolean z) {
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
            String str = builder.begin_apply_time;
            if (str == null) {
                this.begin_apply_time = "";
            } else {
                this.begin_apply_time = str;
            }
            String str2 = builder.begin_vote_time;
            if (str2 == null) {
                this.begin_vote_time = "";
            } else {
                this.begin_vote_time = str2;
            }
            String str3 = builder.begin_public_time;
            if (str3 == null) {
                this.begin_public_time = "";
            } else {
                this.begin_public_time = str3;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            String str4 = builder.remind_time;
            if (str4 == null) {
                this.remind_time = "";
            } else {
                this.remind_time = str4;
            }
            Integer num2 = builder.candidate_num;
            if (num2 == null) {
                this.candidate_num = DEFAULT_CANDIDATE_NUM;
            } else {
                this.candidate_num = num2;
            }
            Integer num3 = builder.total_vote_num;
            if (num3 == null) {
                this.total_vote_num = DEFAULT_TOTAL_VOTE_NUM;
            } else {
                this.total_vote_num = num3;
            }
            Boolean bool = builder.is_voted;
            if (bool == null) {
                this.is_voted = DEFAULT_IS_VOTED;
            } else {
                this.is_voted = bool;
            }
            this.notice = builder.notice;
            return;
        }
        this.begin_apply_time = builder.begin_apply_time;
        this.begin_vote_time = builder.begin_vote_time;
        this.begin_public_time = builder.begin_public_time;
        this.status = builder.status;
        this.remind_time = builder.remind_time;
        this.candidate_num = builder.candidate_num;
        this.total_vote_num = builder.total_vote_num;
        this.is_voted = builder.is_voted;
        this.notice = builder.notice;
    }
}
