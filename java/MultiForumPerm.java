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
/* loaded from: classes8.dex */
public final class MultiForumPerm extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BAWU_TYPE = "";
    public static final Integer DEFAULT_IS_BAWU;
    public static final Integer DEFAULT_IS_BLOCK_BAWU_DELETE;
    public static final Integer DEFAULT_IS_DELETED;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bawu_type;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_bawu;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_block_bawu_delete;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_deleted;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<MultiForumPerm> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String bawu_type;
        public Integer is_bawu;
        public Integer is_block_bawu_delete;
        public Integer is_deleted;

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
        public Builder(MultiForumPerm multiForumPerm) {
            super(multiForumPerm);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {multiForumPerm};
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
            if (multiForumPerm == null) {
                return;
            }
            this.is_bawu = multiForumPerm.is_bawu;
            this.bawu_type = multiForumPerm.bawu_type;
            this.is_deleted = multiForumPerm.is_deleted;
            this.is_block_bawu_delete = multiForumPerm.is_block_bawu_delete;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MultiForumPerm build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new MultiForumPerm(this, z, null) : (MultiForumPerm) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1914072729, "Ltbclient/MultiForumPerm;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1914072729, "Ltbclient/MultiForumPerm;");
                return;
            }
        }
        DEFAULT_IS_BAWU = 0;
        DEFAULT_IS_DELETED = 0;
        DEFAULT_IS_BLOCK_BAWU_DELETE = 0;
    }

    public /* synthetic */ MultiForumPerm(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiForumPerm(Builder builder, boolean z) {
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
            Integer num = builder.is_bawu;
            if (num == null) {
                this.is_bawu = DEFAULT_IS_BAWU;
            } else {
                this.is_bawu = num;
            }
            String str = builder.bawu_type;
            if (str == null) {
                this.bawu_type = "";
            } else {
                this.bawu_type = str;
            }
            Integer num2 = builder.is_deleted;
            if (num2 == null) {
                this.is_deleted = DEFAULT_IS_DELETED;
            } else {
                this.is_deleted = num2;
            }
            Integer num3 = builder.is_block_bawu_delete;
            if (num3 == null) {
                this.is_block_bawu_delete = DEFAULT_IS_BLOCK_BAWU_DELETE;
                return;
            } else {
                this.is_block_bawu_delete = num3;
                return;
            }
        }
        this.is_bawu = builder.is_bawu;
        this.bawu_type = builder.bawu_type;
        this.is_deleted = builder.is_deleted;
        this.is_block_bawu_delete = builder.is_block_bawu_delete;
    }
}
