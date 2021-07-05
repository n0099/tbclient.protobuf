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
/* loaded from: classes10.dex */
public final class ConcernAlbum extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<ConcernUser> DEFAULT_CONCERN_USER;
    public static final Integer DEFAULT_NUM_USER;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3)
    public final Album album;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ConcernUser> concern_user;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer num_user;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ConcernAlbum> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Album album;
        public List<ConcernUser> concern_user;
        public Integer num_user;

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
        public Builder(ConcernAlbum concernAlbum) {
            super(concernAlbum);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {concernAlbum};
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
            if (concernAlbum == null) {
                return;
            }
            this.concern_user = Message.copyOf(concernAlbum.concern_user);
            this.num_user = concernAlbum.num_user;
            this.album = concernAlbum.album;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConcernAlbum build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ConcernAlbum(this, z, null) : (ConcernAlbum) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-633441854, "Ltbclient/ConcernAlbum;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-633441854, "Ltbclient/ConcernAlbum;");
                return;
            }
        }
        DEFAULT_CONCERN_USER = Collections.emptyList();
        DEFAULT_NUM_USER = 0;
    }

    public /* synthetic */ ConcernAlbum(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcernAlbum(Builder builder, boolean z) {
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
            List<ConcernUser> list = builder.concern_user;
            if (list == null) {
                this.concern_user = DEFAULT_CONCERN_USER;
            } else {
                this.concern_user = Message.immutableCopyOf(list);
            }
            Integer num = builder.num_user;
            if (num == null) {
                this.num_user = DEFAULT_NUM_USER;
            } else {
                this.num_user = num;
            }
            this.album = builder.album;
            return;
        }
        this.concern_user = Message.immutableCopyOf(builder.concern_user);
        this.num_user = builder.num_user;
        this.album = builder.album;
    }
}
