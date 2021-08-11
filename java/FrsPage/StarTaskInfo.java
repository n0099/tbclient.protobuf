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
/* loaded from: classes2.dex */
public final class StarTaskInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_TASK_DESC = "";
    public static final String DEFAULT_TASK_SCORE_DESC = "";
    public static final Integer DEFAULT_TASK_STATUS;
    public static final String DEFAULT_TASK_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String task_desc;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String task_score_desc;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer task_status;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String task_title;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<StarTaskInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String task_desc;
        public String task_score_desc;
        public Integer task_status;
        public String task_title;

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
        public Builder(StarTaskInfo starTaskInfo) {
            super(starTaskInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {starTaskInfo};
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
            if (starTaskInfo == null) {
                return;
            }
            this.task_title = starTaskInfo.task_title;
            this.task_desc = starTaskInfo.task_desc;
            this.task_score_desc = starTaskInfo.task_score_desc;
            this.task_status = starTaskInfo.task_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarTaskInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new StarTaskInfo(this, z, null) : (StarTaskInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1368303571, "Ltbclient/FrsPage/StarTaskInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1368303571, "Ltbclient/FrsPage/StarTaskInfo;");
                return;
            }
        }
        DEFAULT_TASK_STATUS = 0;
    }

    public /* synthetic */ StarTaskInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarTaskInfo(Builder builder, boolean z) {
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
            String str = builder.task_title;
            if (str == null) {
                this.task_title = "";
            } else {
                this.task_title = str;
            }
            String str2 = builder.task_desc;
            if (str2 == null) {
                this.task_desc = "";
            } else {
                this.task_desc = str2;
            }
            String str3 = builder.task_score_desc;
            if (str3 == null) {
                this.task_score_desc = "";
            } else {
                this.task_score_desc = str3;
            }
            Integer num = builder.task_status;
            if (num == null) {
                this.task_status = DEFAULT_TASK_STATUS;
                return;
            } else {
                this.task_status = num;
                return;
            }
        }
        this.task_title = builder.task_title;
        this.task_desc = builder.task_desc;
        this.task_score_desc = builder.task_score_desc;
        this.task_status = builder.task_status;
    }
}
