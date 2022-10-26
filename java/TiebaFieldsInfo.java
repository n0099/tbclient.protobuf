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
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class TiebaFieldsInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<String> DEFAULT_TIEBA_FIELDS;
    public static final String DEFAULT_TIEBA_NAME = "";
    public static final List<User> DEFAULT_USER_RANK;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> tieba_fields;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tieba_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<User> user_rank;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List tieba_fields;
        public String tieba_name;
        public List user_rank;

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
        public Builder(TiebaFieldsInfo tiebaFieldsInfo) {
            super(tiebaFieldsInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tiebaFieldsInfo};
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
            if (tiebaFieldsInfo == null) {
                return;
            }
            this.tieba_fields = Message.copyOf(tiebaFieldsInfo.tieba_fields);
            this.tieba_name = tiebaFieldsInfo.tieba_name;
            this.user_rank = Message.copyOf(tiebaFieldsInfo.user_rank);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TiebaFieldsInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new TiebaFieldsInfo(this, z, null);
            }
            return (TiebaFieldsInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(193956527, "Ltbclient/TiebaFieldsInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(193956527, "Ltbclient/TiebaFieldsInfo;");
                return;
            }
        }
        DEFAULT_TIEBA_FIELDS = Collections.emptyList();
        DEFAULT_USER_RANK = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TiebaFieldsInfo(Builder builder, boolean z) {
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
            List list = builder.tieba_fields;
            if (list == null) {
                this.tieba_fields = DEFAULT_TIEBA_FIELDS;
            } else {
                this.tieba_fields = Message.immutableCopyOf(list);
            }
            String str = builder.tieba_name;
            if (str == null) {
                this.tieba_name = "";
            } else {
                this.tieba_name = str;
            }
            List list2 = builder.user_rank;
            if (list2 == null) {
                this.user_rank = DEFAULT_USER_RANK;
                return;
            } else {
                this.user_rank = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.tieba_fields = Message.immutableCopyOf(builder.tieba_fields);
        this.tieba_name = builder.tieba_name;
        this.user_rank = Message.immutableCopyOf(builder.user_rank);
    }

    public /* synthetic */ TiebaFieldsInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
