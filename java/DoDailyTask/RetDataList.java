package tbclient.DoDailyTask;

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
public final class RetDataList extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_NEED_DIALOG;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)
    public final DialogItem dialog;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer need_dialog;
    @ProtoField(tag = 2)
    public final TaskInfoItem task_info;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RetDataList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public DialogItem dialog;
        public Integer need_dialog;
        public TaskInfoItem task_info;

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
        public Builder(RetDataList retDataList) {
            super(retDataList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {retDataList};
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
            if (retDataList == null) {
                return;
            }
            this.dialog = retDataList.dialog;
            this.task_info = retDataList.task_info;
            this.need_dialog = retDataList.need_dialog;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RetDataList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new RetDataList(this, z, null);
            }
            return (RetDataList) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1862343384, "Ltbclient/DoDailyTask/RetDataList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1862343384, "Ltbclient/DoDailyTask/RetDataList;");
                return;
            }
        }
        DEFAULT_NEED_DIALOG = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetDataList(Builder builder, boolean z) {
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
            this.dialog = builder.dialog;
            this.task_info = builder.task_info;
            Integer num = builder.need_dialog;
            if (num == null) {
                this.need_dialog = DEFAULT_NEED_DIALOG;
                return;
            } else {
                this.need_dialog = num;
                return;
            }
        }
        this.dialog = builder.dialog;
        this.task_info = builder.task_info;
        this.need_dialog = builder.need_dialog;
    }

    public /* synthetic */ RetDataList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
